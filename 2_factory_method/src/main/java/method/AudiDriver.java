package method;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public class AudiDriver implements Driver {
    public Car takeCar() {
        return new Audi();
    }
}
