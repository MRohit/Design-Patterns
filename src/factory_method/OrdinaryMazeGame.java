package factory_method;

public class OrdinaryMazeGame extends MazeGame{
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}
