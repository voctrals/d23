package voctrals.study.d23.observer.jdk;

import java.util.Observer;

/**
 * @author lei.liu
 * @since 19-12-12
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer = new Consumer(subject);

        subject.setStatus("start");
        subject.setStatus("run");
        subject.setStatus("stop");
    }
}
