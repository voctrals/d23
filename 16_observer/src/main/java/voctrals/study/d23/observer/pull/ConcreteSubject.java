package voctrals.study.d23.observer.pull;

/**
 * 具体消息
 *
 * @author lei.liu
 * @since 19-12-12
 */
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        // 状态发生改变，通知各个观察者
        this.notifyObservers();
    }

}
