package command;

/**
 * @author lei.liu
 * @since 19-1-14
 */
public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.play();
    }
}
