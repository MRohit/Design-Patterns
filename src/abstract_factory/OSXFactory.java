package abstract_factory;

public class OSXFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
