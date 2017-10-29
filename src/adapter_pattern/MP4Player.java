package adapter_pattern;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("MP4 Media player, playing song:"+fileName);
    }
}
