package voctrals.study.d23.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lei.liu
 * @since 19-12-12
 */
public class Consumer implements Observer {

    public Consumer(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o);
        System.out.println(arg);
        System.out.println("状态发生改变：" + ((Subject) o).getStatus());
    }

}
