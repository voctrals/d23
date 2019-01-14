package command;

/**
 * @author lei.liu
 * @since 19-1-14
 */
public class KeyPad {
    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command command) {
        this.playCommand = command;
    }

    public void setRewindCommand(Command command) {
        this.rewindCommand = command;
    }

    public void setStopCommand(Command command) {
        this.stopCommand = command;
    }

    public void play() {
        this.playCommand.execute();
    }

    public void rewind() {
        this.rewindCommand.execute();
    }

    public void stop() {
        this.stopCommand.execute();
    }
}
