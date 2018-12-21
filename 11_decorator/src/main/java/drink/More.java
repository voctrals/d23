package drink;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class More extends Plus {

    public More(DrinkType drinkType) {
        super(drinkType);
        price = 10;
    }

    @Override
    public void desc() {
        System.out.println(this.price);
        System.out.println("加量");
    }
}
