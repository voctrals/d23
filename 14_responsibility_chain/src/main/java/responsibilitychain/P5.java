package responsibilitychain;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class P5 extends AbstractHandler {
    public String handle(Integer mount) {
        if (mount > 500) {
            if (getHandler() != null) return getHandler().handle(mount);
            return "...";
        } else {
            return "P5 process...";
        }
    }
}
