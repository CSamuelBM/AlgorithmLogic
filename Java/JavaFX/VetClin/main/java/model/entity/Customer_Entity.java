package model.entity;

public class Customer_Entity {

    private int idCustomer;
    private User_Entity user;

    public Customer_Entity(User_Entity user) {
        setUser(user);
    }

    public long getId() {
        return idCustomer;
    }

    public User_Entity getUser() {
        return user;
    }

    public void setUser(User_Entity user) {
        this.user = user;
    }

}
