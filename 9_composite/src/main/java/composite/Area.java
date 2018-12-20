package composite;

import java.util.List;
import java.util.Objects;

/**
 * @author lei.liu
 * @since 18-12-20
 */
public abstract class Area {

    protected String name;
    protected Long zoneId;
    protected Long pid;

    public Area(Long zoneId, String name) {
        this.name = name;
        this.zoneId = zoneId;
    }

    public abstract List<Area> getSubArea();

    public abstract boolean addSubArea(Long zoneId, String name);

    public abstract boolean removeSubArea(Long zoneId);

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Area area = (Area) o;
        return
                Objects.equals(zoneId, area.zoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId);
    }
}
