package model.entity;

public class Role_Entity {

    private int idRole;
    private String name;

    public Role_Entity(String name) {
        setName(name);
    }

    public int getIdRole() {
        return idRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
