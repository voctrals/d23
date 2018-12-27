package dynamic;

/**
 * @author lei.liu
 * @since 18-12-22
 */
public class TestInterface2Impl implements TestInterface2 {
    public void testAbility() {
        System.out.println("TestInterface Default Implementation...");
    }

    @Override
    public String toString() {
        return "TestInterfaceImpl{}";
    }
}
