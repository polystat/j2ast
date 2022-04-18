package tree;

import java.util.ArrayList;

public class InitializerArray extends Initializer
{
    // Structure
    public ArrayList<Initializer> initializers;

    // Creation
    public InitializerArray(Initializer init)
    {
        this.initializers = new ArrayList<>();
        this.initializers.add(init);
        if (init != null) {
            init.parent = this;
        }
        Entity.reportParsing("INITIALIZER ARRAY");
    }

    public InitializerArray add(Initializer init) {
        this.initializers.add(init);
        if (init != null) {
            init.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh)
    {
        title("ARRAY INITIALIZER",sh);
        for ( Initializer init: initializers )
        {
            init.report(sh+Entity.shift);
        }
    }

}
