package prototype_pattern;

public class Client {
    public static void main(String args[]) throws CloneNotSupportedException {
        ShapeCache.loadCacheShapes();

        Shape clonedObj1 = ShapeCache.getShape("1");
        System.out.println("Shape:"+clonedObj1.getType());


        Shape clonedObj2 = ShapeCache.getShape("2");
        System.out.println("Shape:"+clonedObj2.getType());


        Shape clonedObj3 = ShapeCache.getShape("3");
        System.out.println("Shape:"+clonedObj3.getType());
    }
}
