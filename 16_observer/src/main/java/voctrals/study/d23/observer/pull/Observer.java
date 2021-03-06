package voctrals.study.d23.observer.pull;

/**
 * 观察者
 * 收到主题消息就处理
 *
 * @author lei.liu
 * @since 19-12-12
 */
public interface Observer {

    void update(Subject subject);

}
