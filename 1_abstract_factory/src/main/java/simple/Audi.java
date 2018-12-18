package simple;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class Audi extends Car {
    public Audi() {
        setName("Audi");
    }

    public void drive() {
        System.out.println("Driving " + getName());
    }
}
