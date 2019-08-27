package factory.method.dazauto;

import factory.method.AbstractFactory;
import factory.method.AbstractProduct;

/**
 * @author lei.liu
 * @since 19-8-27
 */
public class DazAutoFactory extends AbstractFactory {
    @Override
    public AbstractProduct produce() {
        return new DazAuto();
    }
}
