package method;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class Boss {
    public static void main(String[] args) {
        Driver driver = new AudiDriver();
        Car car = driver.takeCar();
        car.drive();
    }
}
