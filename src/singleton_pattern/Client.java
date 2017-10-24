package singleton_pattern;

import static java.lang.System.*;
public class Client {
    public static void main(String args[]) {
        // Creating instance
        Singleton instance = Singleton.getInstance();
        instance.operation();

        // Creating another reference with same instance
        Singleton reference = Singleton.getInstance();
        reference.operation();

    }
}
