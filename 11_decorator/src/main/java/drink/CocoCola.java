package drink;

/**
 * @author lei.liu
 * @since 18-12-21
 */
public class CocoCola extends DrinkType {

    public CocoCola(Integer price) {
        this.price = price;
    }

    @Override
    public void desc() {
        System.out.println(this.price + "的");
        System.out.println("可口可乐");
    }

}
