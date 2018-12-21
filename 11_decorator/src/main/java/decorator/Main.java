package decorator;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class Main {

    public static void main(String[] args) {
        Wareable wareable = new Man();
        Wareable flower = new Flower(wareable);
        Wareable glasses = new Glasses(flower);
        glasses.ware();
    }
}
