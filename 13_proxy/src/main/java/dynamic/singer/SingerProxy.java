package dynamic.singer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lei.liu
 * @since 19-7-31
 */
public class SingerProxy implements InvocationHandler {
    private Object target;

    public SingerProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before... something todo...");
        Object invoke = method.invoke(target, args);
        System.out.println("After... something todo...");
        return invoke;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
