package drink;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Ice extends Plus {
    public Ice(DrinkType drinkType) {
        super(drinkType);
        this.price = 1;
    }

    @Override
    public void desc() {
        System.out.println(this.price);
        System.out.println("加冰。。。");
    }
}
