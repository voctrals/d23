package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lei.liu
 * @since 18-12-22
 */
public class TestInterfaceInvocationHandler implements InvocationHandler {

    private TestInterface testInterface;

    public TestInterfaceInvocationHandler(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before...");
        Object result = method.invoke(testInterface, args);
        System.out.println("After...");
        return result;
    }
}
