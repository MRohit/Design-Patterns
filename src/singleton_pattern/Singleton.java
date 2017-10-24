package singleton_pattern;

import static java.lang.System.out;

public class Singleton {
    private static volatile Singleton instance = null;
    int id;
    private Singleton() {
        id = 1;
    }
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void operation() {
        out.println("Doing operation for singleton instance with id:"+this.id);
    }
}
