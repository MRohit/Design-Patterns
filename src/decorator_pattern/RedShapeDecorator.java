package decorator_pattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorderColor(decoratedShape);
    }

    private void setRedBorderColor(Shape decoratedShape) {
        System.out.println("Setting Red Border Color");
    }
}
