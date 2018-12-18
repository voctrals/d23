package lazy;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class LazySingleton {
    private LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public LazySingleton getInstance() {
        if (lazySingleton == null) lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
