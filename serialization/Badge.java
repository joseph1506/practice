package practice.serialization;

import java.io.Serializable;

public class Badge implements Serializable {
    private String name;
    private String id;

    public Badge(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Badge() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
