package command;

/**
 * @author lei.liu
 * @since 19-1-14
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void execute() {
        audioPlayer.stop();
    }
}
