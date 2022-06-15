package tree;

import lexer.Span;
import lexer.Token;

import java.lang.reflect.Field;

// The root class of the whole hierarchy of classes
// representing various Java constructs.

public class Entity
{
    public static final int shift = 4;
    public static boolean debug = false;
    public static boolean syntaxOnly = false;
    // All entities created by the program are assigned unique numbers.
    private static long count = 0;
    // Entity's unique number
    public long unique;
    // Text coordinates of the entity
    public Span span;

    // // Tricks for resolving conflicts
    //
    // public static boolean inBlock = false;
    // public static boolean unAnnotatedTypeTaken = false;

    // Machinery for reporting
    // Managing references to parent nodes
    public Entity parent;

    // Constructors
    public Entity() {
        count++;
        unique = count;
    }

    public Entity(Span span) {
        this();
        this.span = span;
    }

    public Entity(Token token) {
        this();
        this.span = token.span;
    }

    public static void doShift(int sh) {
        for (int i = 1; i <= sh; i++) {
            System.out.print(" ");
        }
    }

    public void outUnique() {
        System.out.print(unique);
        System.out.print(":");
    }

    public void title(String n, int sh) {
        doShift(sh);
        outUnique();
        System.out.println(n);
    }

    public void report(int sh) {

    }

    public static void reportParsing(String title)
    {
        if ( !debug ) return;
        for ( int i=1; i<=20; i++ ) System.out.print(" ");
        System.out.println(title);
    }

    public void validateParent(Class<?> currentClass) {
        for (Field field : currentClass.getDeclaredFields()) {
            if (!field.getName().equals("parent")) {
                try {
                    Object o = field.get(this);

                    if (o instanceof Iterable<?> items) {
                        for (Object item : items) {
                            if (item instanceof Entity e) {
                                e.parent = this;
                                e.validateParent(e.getClass());
                            }
                        }
                    } else if (o instanceof Entity e) {
                        e.parent = this;
                        e.validateParent(e.getClass());
                    }
                } catch (IllegalAccessException e) {
                    /* Nothing here */
                }
            }
        }

        if (currentClass.getSuperclass() != null) {
            validateParent(currentClass.getSuperclass());
        }
    }
}
