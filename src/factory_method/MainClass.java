package factory_method;

public class MainClass {
    public static void main (String args[]) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }
}
