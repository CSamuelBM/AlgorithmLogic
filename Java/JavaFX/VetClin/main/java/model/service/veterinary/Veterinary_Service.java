package model.service.veterinary;

import model.dao.Role_Dao.Role_Dao;
import model.dao.user.User_Dao;
import model.dao.veterinary.Veterinary_Dao;
import model.entity.Role_Entity;
import model.entity.User_Entity;
import model.entity.Veterinary_Entity;

import java.sql.SQLException;

public class Veterinary_Service {

    private final Role_Dao roleQuery = new Role_Dao();
    private final User_Dao userQuery = new User_Dao();
    private final Veterinary_Dao veterinaryQuery = new Veterinary_Dao();
    public boolean saveVeterinary(Role_Entity role, User_Entity user, Veterinary_Entity veterinary){
        if (user.getFullName().isEmpty() || !user.getEmail().contains("@") || user.getPhone().length() < 10) {
            return false;
        }

        try {
            roleQuery.saveRole(role);
            userQuery.saveUser(user);
            veterinaryQuery.saveVeterinary(veterinary);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
