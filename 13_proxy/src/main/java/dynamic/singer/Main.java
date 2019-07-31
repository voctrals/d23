package dynamic.singer;

import java.lang.reflect.Proxy;

/**
 * @author lei.liu
 * @since 19-7-31
 */
public class Main {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Singer singer = new JackeyCheung();
        Singer proxy = (Singer) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), singer.getClass().getInterfaces(), new SingerProxy(singer));
        proxy.name();
        proxy.style();
        proxy.songList();
    }
}
