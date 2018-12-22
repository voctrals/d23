package dynamic;

/*

JDK的动态代理，就是在程序运行的过程中，根据被代理的接口来动态生成代理类的class文件，并加载运行的过程。

1，这个代理类是被JDK生成的，并且存放在JVM的一个WeakCache中，具体逻辑可以查看Proxy的代码。

2，继承了Proxy类，实现了代理的接口，由于java不能多继承，这里已经继承了Proxy类了，不能再继承其他的类，所以JDK的动态代理不支持对实现类的代理，只支持接口的代理。这也是invocationHandler存在的价值。

3，代理对象代理目标对象承诺的所有接口方法，以及toString，equals和hashcode这三个方法。

https://www.cnblogs.com/voctrals/p/9848302.html

*/