package bridge;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public class PorkyNoodle extends Noodle {

    public PorkyNoodle(Peppery peppery) {
        super(peppery);
    }

    @Override
    public void eat() {
        System.out.println(peppery.style() + " 大肉面。");
    }
}
