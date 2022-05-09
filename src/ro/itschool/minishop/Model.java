package ro.itschool.minishop;

import java.io.Serializable;

public class Model implements Serializable {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
