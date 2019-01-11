package responsibilitychain;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public abstract class AbstractHandler {
    private AbstractHandler handler;

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    public AbstractHandler getHandler() {
        return this.handler;
    }

    public abstract String handle(Integer mount);
}
