package prototype_pattern;

public class Square extends Shape {
    public Square() {
        type="Square";
    }
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}
