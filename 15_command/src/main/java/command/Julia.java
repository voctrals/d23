package command;

/**
 * @author lei.liu
 * @since 19-1-14
 */
public class Julia {

    public static void main(String[] args) {
        // 接受者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        // 命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);

        // 请求者对象
        KeyPad keyPad = new KeyPad();
        keyPad.setPlayCommand(playCommand);
        keyPad.setRewindCommand(rewindCommand);
        keyPad.setStopCommand(stopCommand);

        // 测试
        keyPad.play();
        keyPad.rewind();
        keyPad.stop();
        keyPad.play();
        keyPad.stop();
    }
}
