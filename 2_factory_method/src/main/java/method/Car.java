package method;

/**
 * @author lei.liu
 * @since 18-12-18
 */
public abstract class Car {

    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
