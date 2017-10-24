package composite_pattern;

import static java.lang.System.*;

public class Ellipse implements Graphic{
    @Override
    public void print() {
        out.println("In Ellipse print Method");
    }
}
