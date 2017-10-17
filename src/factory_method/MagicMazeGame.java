package factory_method;

public class MagicMazeGame extends MazeGame{
    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
