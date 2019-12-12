package voctrals.study.d23.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * 我有一堆观察者
 *
 * @author lei.liu
 * @since 19-12-12
 */
public abstract class Subject {

    /** 观察者列表 */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者
     *
     * @param observer o
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 删除观察者对象
     *
     * @param observer o
     */
    public void detach(Observer observer) {

        list.remove(observer);
    }


    /**
     * 通知所有注册的观察者对象
     */
    public void notifyObservers(String newState) {

        for (Observer observer : list) {
            observer.update(newState);
        }
    }

}
