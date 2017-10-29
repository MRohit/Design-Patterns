package adapter_pattern;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("VLC Media player, playing song:"+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
