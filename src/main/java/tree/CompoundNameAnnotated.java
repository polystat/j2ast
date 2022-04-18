package tree;

import java.util.ArrayList;

public class CompoundNameAnnotated extends CompoundName
{
    // Structure
    public ArrayList<Annotations> annotations;

    // Creation
    public CompoundNameAnnotated(Annotations anns, String name)
    {
        super(name);
        annotations = new ArrayList<>();
        annotations.add(anns);

        Entity.reportParsing("COMPOUND NAME ANNOTATED");
    }

    // Adding
    public CompoundNameAnnotated add(Annotations anns, String next)
    {
        names.add(next);
        annotations.add(anns);
        return this;
    }

    // Reporting
    public void report(int sh) {
        this.title("ANNOTATED COMPOUND NAME",sh);
        int currSh = sh+Entity.shift;
        for (int i = 0; i < names.size(); i++) {
            Entity.doShift(currSh);
            System.out.println(names.get(i));
            if ( annotations.get(i) != null )
                annotations.get(i).report(currSh);
            currSh += Entity.shift;
        }
    }

}
