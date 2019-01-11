package responsibilitychain;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class Tester {
    public static void main(String[] args) {
        AbstractHandler p5 = new P5();
        AbstractHandler p8 = new P8();
        AbstractHandler p20 = new P20();

        p5.setHandler(p8);
        p8.setHandler(p20);

        System.out.println(p5.handle(50));
        System.out.println(p5.handle(600));
        System.out.println(p5.handle(20000));
    }
}
