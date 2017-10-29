package abstract_factory;

public class WinFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }
}
