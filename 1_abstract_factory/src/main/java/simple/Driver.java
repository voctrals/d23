package simple;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class Driver {

    public Car takeCar(String name) {
        if ("benz".equals(name)) {
            return new Benz();
        } else if ("audi".equals(name)) {
            return new Audi();
        } else {
            return null;
        }
    }
}
