package prototype_pattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape> ();

    public static Shape getShape(String id) throws CloneNotSupportedException{
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }
    public static void loadCacheShapes() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }

}
