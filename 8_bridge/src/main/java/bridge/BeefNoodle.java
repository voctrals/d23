package bridge;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public class BeefNoodle extends Noodle {

    public BeefNoodle(Peppery peppery) {
        super(peppery);
    }

    @Override
    public void eat() {
        System.out.println(peppery.style() + " 牛肉面。");
    }
}
