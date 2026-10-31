package model.entity;

import java.time.LocalDate;

public class User_Entity {

    private int idUser;
    private String fullName;
    private String email;
    private String phone;
    private LocalDate birthday;
    private Role_Entity role;

    public User_Entity(String fullName, String email, String phone, LocalDate birthday, Role_Entity role) {
        setFullName(fullName);
        setEmail(email);
        setPhone(phone);
        setBirthday(birthday);
        setRole(role);
    }

    public int getIdUser() {
        return idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Role_Entity getRole() {
        return role;
    }

    public void setRole(Role_Entity role) {
        this.role = role;
    }

}
