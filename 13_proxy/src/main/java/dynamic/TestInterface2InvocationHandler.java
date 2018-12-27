package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lei.liu
 * @since 18-12-22
 */
public class TestInterface2InvocationHandler implements InvocationHandler {

    private TestInterface2 testInterface;

    public TestInterface2InvocationHandler(TestInterface2 testInterface) {
        this.testInterface = testInterface;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before...");
        Object result = method.invoke(testInterface, args);
        System.out.println("After...");
        return result;
    }
}
