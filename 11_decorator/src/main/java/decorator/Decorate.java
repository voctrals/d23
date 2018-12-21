package decorator;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Decorate implements Wareable {

    Wareable wareable;

    public Decorate(Wareable wareable) {
        this.wareable = wareable;
    }

    @Override
    public void ware() {
        wareable.ware();
    }
}
