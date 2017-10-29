package prototype_pattern;

public class Circle extends Shape {

    public Circle() {
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
