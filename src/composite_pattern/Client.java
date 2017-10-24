package composite_pattern;

import static java.lang.System.*;
public class Client {
    public static void main (String args[]) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();
        Ellipse ellipse5 = new Ellipse();

        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        out.println("\n**Using Composite class**\n");
        graphic1.print();

        out.println("\n**Using Leaf Class**\n");
        ellipse4.print();
        ellipse5.print();
    }
}
