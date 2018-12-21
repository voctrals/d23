package decorator;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Flower extends Decorate {
    public Flower(Wareable wareable) {
        super(wareable);
    }

    @Override
    public void ware() {
        super.ware();
        System.out.println("flower ...");
    }
}
