package practice.serialization;

import java.io.Serializable;

public class DemolitionMan implements Serializable {
    /*private transient Badge badge;*/
    private Badge badge;

    public DemolitionMan(Badge badge) {
        this.badge = badge;
    }

    /*private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeObject(badge.getId());
        os.writeObject(badge.getName());
    }

    private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
        is.defaultReadObject();
        badge= new Badge();
        badge.setId((String) is.readObject());
        badge.setName((String) is.readObject());
    }
*/
    public Badge getBadge() {
        return badge;
    }
}
