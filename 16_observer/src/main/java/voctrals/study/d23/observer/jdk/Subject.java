package voctrals.study.d23.observer.jdk;

import java.util.Observable;

/**
 * @author lei.liu
 * @since 19-12-12
 */
public class Subject extends Observable {

    public String status = "";


    public String getStatus() {
        return status;
    }

    public void setStatus(String data) {

        if (!this.status.equals(data)) {
            this.status = data;
            setChanged();
        }
        notifyObservers();
    }

}
