package drink;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public abstract class Plus extends DrinkType {
    private DrinkType drinkType;
    public Plus(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
