package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lei.liu
 * @since 18-12-20
 */
public class Container extends Area {

    private List<Area> subAreaList = new ArrayList<>();

    public Container(Long zoneId, String name) {
        super(zoneId, name);
    }

    @Override
    public List<Area> getSubArea() {
        return subAreaList;
    }

    @Override
    public boolean addSubArea(Long zoneId, String name) {
        Area area = new Container(zoneId, name);
        area.pid = this.zoneId;
        return subAreaList.add(area);
    }

    public boolean addSubArea(Area area) {
        return subAreaList.add(area);
    }

    @Override
    public boolean removeSubArea(Long zoneId) {
        return subAreaList.remove(new Container(zoneId, ""));
    }
}
