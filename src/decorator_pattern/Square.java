package decorator_pattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
