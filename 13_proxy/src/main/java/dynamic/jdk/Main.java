package dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lei.liu
 * @since 19-7-22
 */
public class Main {
    public static void main(String[] args) {
        Api api = (Api) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Api.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before...");

                System.out.println(method.getName() + " is called");

                System.out.println("after...");
                return null;
            }

            @Override
            public String toString() {
                return ">>>>>>>>>>>>>>>>>";
            }

        });

        api.test();
        api.test2();
    }
}
