package drink;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Main {

    public static void main(String[] args) {
        DrinkType cocoCola = new CocoCola(20);
        cocoCola.desc();
        DrinkType more = new More(cocoCola);
        more.desc();
        DrinkType ice = new Ice(more);
        ice.desc();
    }
}
