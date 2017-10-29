package prototype_pattern;

public class Rectangle extends Shape {
    public Rectangle() {
        type="Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}
