package method;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class Benz extends Car {
    public Benz() {
        setName("Benz");
    }

    public void drive() {
        System.out.println("Driving " + getName());
    }
}
