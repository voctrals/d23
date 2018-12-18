package eager;

/**
 * 俄汉式单例模式
 *
 * @author lei.liu
 * @since 18-12-18
 */
public class EagerSingleton {

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public EagerSingleton getInstance() {
        return eagerSingleton;
    }

}
