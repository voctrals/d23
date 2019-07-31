package dynamic.singer.invoke.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SBuilderInvocationHandler implements InvocationHandler {
    private String value = "";

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("append")) {
            value = value + args[0];
            return proxy;
        }
        if (method.getName().equals("value")) {
            return value;
        }
        return null;
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SBuilder sBuilder = (SBuilder) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{SBuilder.class}, new SBuilderInvocationHandler());
        sBuilder.append("a").append("b").append("c");
        System.out.println(sBuilder.value());
    }
}
