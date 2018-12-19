package bridge;

/**
 * @author lei.liu
 * @since 18-12-19
 */
public class Main {

    public static void main(String[] args) {
        Noodle noPepperyBeefNoodle = new BeefNoodle(new Level0Peppery());
        noPepperyBeefNoodle.eat();
        Noodle midPepperyBeefNoodle = new PorkyNoodle(new Level3Peppery());
        midPepperyBeefNoodle.eat();
    }

}
