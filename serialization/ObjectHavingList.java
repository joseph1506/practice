package practice.serialization;

import java.io.Serializable;
import java.util.List;

public class ObjectHavingList implements Serializable {
    private List objectList;

    public ObjectHavingList(List objectList) {
        this.objectList = objectList;
    }

    public List getObjectList() {
        return objectList;
    }

}
