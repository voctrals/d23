package doublecheck;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class DoubleCheckSingleton {

    private volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
