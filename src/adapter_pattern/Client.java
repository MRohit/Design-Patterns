package adapter_pattern;

public class Client {
    public static void main(String args[]) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","See you again");
        audioPlayer.play("vlc","VLC Song");

        audioPlayer.play("mp4","MP4 Song");
    }
}
