package decorator_pattern;

public class Client {
    public static void main(String args[]) {
        Shape square = new Square ();

        Shape reqSquare = new RedShapeDecorator(new Square());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Square with normal border:");
        square.draw();

        System.out.println("Square with red border");
        reqSquare.draw();

        System.out.println("Rectangle with red border");
        redRectangle.draw();
    }
}
