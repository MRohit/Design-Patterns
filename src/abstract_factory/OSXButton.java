package abstract_factory;

public class OSXButton implements IButton {
    @Override
    public void paint() {
        System.out.println("This is OS Button paint method");
    }
}
