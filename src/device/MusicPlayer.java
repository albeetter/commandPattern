package device;

public class MusicPlayer {
    private boolean isPlaying;
    private String currentSong;

    public String play() {
        isPlaying = true;
        currentSong = "Relaxing Melody";
        return "Playing: " + currentSong;
    }

    public String stop() {
        isPlaying = false;
        currentSong = null;
        return "Music stopped";
    }
}