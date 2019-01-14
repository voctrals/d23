package command;

/**
 * @author lei.liu
 * @since 19-1-14
 */
public class RewindCommand implements Command {
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.rewind();
    }
}
