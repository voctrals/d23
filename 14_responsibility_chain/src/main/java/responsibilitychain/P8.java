package responsibilitychain;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class P8 extends AbstractHandler {
    public String handle(Integer mount) {
        if (mount > 800) {
            if (getHandler() != null) return getHandler().handle(mount);
            return "...";
        } else {
            return "P8 process...";
        }
    }
}
