package factory.method;

import factory.method.bmw.BMWFactory;
import factory.method.dazauto.DazAutoFactory;

/**
 * @author lei.liu
 * @since 19-8-27
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new DazAutoFactory();
        AbstractProduct product = factory.produce();
        System.out.println(product);

        AbstractFactory factory2 = new BMWFactory();
        AbstractProduct product2 = factory2.produce();
        System.out.println(product2);
    }

}
