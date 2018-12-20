package composite;

/**
 * @author lei.liu
 * @since 18-12-20
 */
public class MainTest {

    public static void main(String[] args) {
        Area area = new Container(10000L, "北京市");
        area.addSubArea(101000L, "北京市");

        area.getSubArea().get(0).addSubArea(101010L, "朝阳区");
        area.getSubArea().get(0).addSubArea(101020L, "海淀区");
        System.out.println(area);
    }
}
