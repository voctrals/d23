package voctrals.study.d23.observer.pull;

/**
 * 具体观察者
 *
 * @author lei.liu
 * @since 19-12-12
 */
public class ConcreteObserver implements Observer {

    /** 观察者的状态 */
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject) subject).getState();
        System.out.println("状态为：" + observerState);
    }
}
