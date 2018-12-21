package decorator;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Man implements Wareable {
    @Override
    public void ware() {
        System.out.println("Ware clothes...");
    }
}
