package decorator;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Glasses extends Decorate {
    public Glasses(Wareable wareable) {
        super(wareable);
    }

    @Override
    public void ware() {
        super.ware();
        System.out.println("glasses ...");
    }
}
