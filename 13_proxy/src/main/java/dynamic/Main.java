package dynamic;

import java.lang.reflect.Proxy;

/**
 * @author lei.liu
 * @since 18-12-22
 */
public class Main {

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        TestInterface proxy = (TestInterface) Proxy.newProxyInstance(TestInterfaceImpl.class.getClassLoader(),
                new Class[]{TestInterface.class},
                new TestInterfaceInvocationHandler(new TestInterfaceImpl())
        );

        TestInterface2 proxy1 = (TestInterface2) Proxy.newProxyInstance(TestInterface2Impl.class.getClassLoader(),
                new Class[]{TestInterface2.class},
                new TestInterface2InvocationHandler(new TestInterface2Impl())
        );

        proxy.testAbility();

    }

}
