package facade;

import java.util.UUID;

/**
 * @author lei.liu
 * @since 18-12-20
 * 挂号
 */
public class Register {

    /**
     * 获得挂号单
     */
    public String register() {
        return UUID.randomUUID().toString();
    }

}
