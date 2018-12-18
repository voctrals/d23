package innerclass;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class InnerClass {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
