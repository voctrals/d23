package uml;

/**
 * @author lei.liu
 * @since 19-8-23
 */
interface Component {
    void operation();
}


class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("我是具体的实现者");
    }
}

abstract class Decorator implements Component {
    Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}

class ConcreteComponentA extends Decorator {
    @Override
    public void operation() {
        System.out.println("hahahahahahah");
        super.operation();
        System.out.println("我是具体的实现者A");
    }
}

class ConcreteComponentB extends Decorator {
    @Override
    public void operation() {
        System.out.println("lalalalala");
        super.operation();
        System.out.println("我是具体的实现者B");
    }
}

public class UML {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteComponentA concreteComponentA = new ConcreteComponentA();
        ConcreteComponentB concreteComponentB = new ConcreteComponentB();

        concreteComponentA.setComponent(concreteComponent);
        concreteComponentB.setComponent(concreteComponentA);
        concreteComponentB.operation();
    }
}