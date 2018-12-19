package bridge;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public abstract class Noodle {

    protected Peppery peppery;

    public Noodle(Peppery peppery) {
        this.peppery = peppery;
    }

    public abstract void eat();

}
