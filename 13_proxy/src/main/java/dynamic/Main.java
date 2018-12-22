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

        proxy.testAbility();

    }

}
