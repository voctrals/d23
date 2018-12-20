package composite;

import java.util.List;

/**
 * @author lei.liu
 * @since 18-12-20
 */
public class Leaf extends Area {

    public Leaf(Long zoneId, String name) {
        super(zoneId, name);
    }

    @Override
    public List<Area> getSubArea() {
        return null;
    }

    @Override
    public boolean addSubArea(Long zoneId, String name) {
        return false;
    }

    @Override
    public boolean removeSubArea(Long zoneId) {
        return false;
    }
}
