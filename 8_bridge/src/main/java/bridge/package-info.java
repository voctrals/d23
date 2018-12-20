package bridge;
/*

桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。

*/

/*

面条（辣度）

微辣肉面

面条是抽象类，辣度是接口，微辣牛肉面是具体实现类

abstract class A {

    private Interface ability;

    public A(Interface ability) {
        this.ability = ability;
    }

    public abstract void method();

}

抽象类的构造方法，这个很别致啊

*/