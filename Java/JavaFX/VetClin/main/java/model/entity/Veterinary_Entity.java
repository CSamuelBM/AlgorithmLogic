package model.entity;

public class Veterinary_Entity {

    private int idVeterinary;
    private String specialty;
    private User_Entity user;

    public Veterinary_Entity(String specialty, User_Entity user) {
        setSpecialty(specialty);
        setUser(user);
    }

    public long getIdVeterinary() {
        return idVeterinary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public User_Entity getUser() {
        return user;
    }

    public void setUser(User_Entity user) {
        this.user = user;
    }
}
