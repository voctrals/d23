package voctrals.study.d23.observer.push;

/**
 * @author lei.liu
 * @since 19-12-12
 */
public class Client {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver();

        subject.attach(observer);

        subject.change("123");

    }
}
