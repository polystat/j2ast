import org.apache.tools.ant.taskdefs.condition.Os
import java.security.MessageDigest

plugins {
    java
    `maven-publish`
    signing
}

group = "org.polystat"
version = "0.0.3"


val mvnUsername: String? by project
val mvnPassword: String? by project
val mvnPublicationVersion: String? by project
val candidates: String? by project


// The Java grammar source file for Bison
val javaGrammarFilePath = "src/main/resources/Java_16_Grammar.y"

// Where to put Bison compilation report
val reportFilePath = "out/Java_16_Grammar.report"

// Where to put generated parser
val javaParserFilePath = "src/main/java/parser/JavaParser.java"

// MD5 of the latest generated grammar file is stored here
val latestGrammarMD5FilePath = "out/latestGrammarMD5"


java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11

    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // Library for command-line arguments support
    implementation("commons-cli:commons-cli:1.5.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.getByName("build") {
    createOutDirs()

    // Only run Bison build if grammar file changed
    if (readMD5FromFile(latestGrammarMD5FilePath) != grammarFileMD5()) {
        println("Grammar file changed since last build; Rebuilding parser with Bison...")
        runBison()
        writeMD5ToFile(grammarFileMD5(), latestGrammarMD5FilePath)
    } else {
        println("Grammar file didn't change; Skipping parser build.")
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "org.polystat"
            artifactId = "j2ast"
            version = listOfNotNull(mvnPublicationVersion, project.version as String).first()
            from(components["java"])
            pom {
                name.set("j2ast")
                description.set("Java parser")
                url.set("https://github.com/polystat/j2ast")
                // properties.set(mapOf(
                //     "myProp" to "value",
                //     "prop.with.dots" to "anotherValue"
                // ))
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/polystat/polystat/blob/master/LICENSE.txt")
                    }
                }
                developers {
                    developer {
                        id.set("zouev")
                        name.set("Eugene Zouev")
                        email.set("e.zuev@innopolis.ru")
                    }
                    developer {
                        id.set("IamMaxim58")
                        name.set("Maxim Stepanov")
                        email.set("m.stepanov@innopolis.university")
                    }
                    developer {
                        id.set("Ilia_Mil")
                        name.set("Ilya Milyoshin")
                        email.set("i.mileshin@innopolis.university")
                    }
                    developer {
                        id.set("egorklementev")
                        name.set("Egor Klementev")
                        email.set("e.klementev@innopolis.ru")
                    }
                }
                scm {
                    connection.set("scm:git:git@github.com:polystat/j2ast.git")
                    developerConnection.set("scm:git:git@github.com:polystat/j2ast.git")
                    url.set("https://github.com/polystat/j2ast")
                }
            }
            repositories {
                maven {
                    credentials {
                        println("Applying Maven credentials")

                        username = mvnUsername
                        password = mvnPassword
                    }
                    url = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
                }
            }
        }
    }
}

/**
 * Creates directories for all Bison output files.
 */
fun createOutDirs() {
    // Create out directory if it doesn't exist, so report may be placed inside
    val outPath = reportFilePath.substring(0, reportFilePath.lastIndexOf("/"))
    file(outPath).mkdirs()

    // Create parser directory if it doesn't exist, so parser may be placed inside
    val parserPath = javaParserFilePath.substring(0, javaParserFilePath.lastIndexOf("/"))
    file(parserPath).mkdirs()
}

/**
 * Runs Bison using OS-specific shell command.
 */
fun runBison() =
    try {
        when {
            Os.isFamily(Os.FAMILY_WINDOWS) ->
                exec {
                    workingDir = File(".")
                    executable = "bin/win_bison.exe"
                    args = mutableListOf(
                        "--report=states,lookaheads",
                        // "-r", "all",
                        // "--debug", "--help", "--stacktrace",
                        "--report-file=${reportFilePath}",
                        "--output=${javaParserFilePath}",
                        javaGrammarFilePath
                    )
                }
            Os.isFamily(Os.FAMILY_MAC) ->
                exec {
                    workingDir = File(".")
                    executable = "bin/bison_mac"
                    args = mutableListOf(
                        "--report=states,lookaheads",
                        "--report-file=${reportFilePath}",
                        "--output=${javaParserFilePath}",
                        javaGrammarFilePath
                    )
                }
            Os.isFamily(Os.FAMILY_UNIX) ->
                exec {
                    workingDir = File(".")
                    executable = "bison"
                    args = mutableListOf(
                        "--report=states,lookaheads",
                        "--report-file=${reportFilePath}",
                        "--output=${javaParserFilePath}",
                        javaGrammarFilePath
                    )
                }
            else ->
                throw UnsupportedOperationException(
                    "Your OS is not yet supported. File a GitHub or issue or " +
                            "provide a Pull Request with support for Bison execution for your OS."
                )
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }


/**
 * Returns MD5 string for a given file.
 */
fun generateMD5(filepath: String): String {
    val digest: MessageDigest = MessageDigest.getInstance("MD5")

    println("Working Directory = " + System.getProperty("user.dir"))

    File(filepath).inputStream().use { inputStream ->
        val buffer = ByteArray(8192)
        var read = 0
        do {
            digest.update(buffer, 0, read)
            read = inputStream.read(buffer)
        } while (read > 0)
    }

    val md5sum: ByteArray = digest.digest()
    val bigInt = BigInteger(1, md5sum)

    return bigInt.toString(16).padStart(32, '0')
}

fun grammarFileMD5(): String =
    generateMD5(javaGrammarFilePath)

fun readMD5FromFile(filepath: String): String =
    File(filepath).let { f ->
        if (f.exists())
            File(filepath).readText()
        else
            ""
    }

fun writeMD5ToFile(md5: String, filepath: String) =
    File(filepath).writeText(md5)
