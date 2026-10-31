package model.service.customer;

import model.dao.Role_Dao.Role_Dao;
import model.dao.customer.Customer_Dao;
import model.dao.user.User_Dao;
import model.entity.Customer_Entity;
import model.entity.Role_Entity;
import model.entity.User_Entity;

import java.sql.SQLException;
public class Customer_Service {

    private final Role_Dao roleQuery = new Role_Dao();
    private final User_Dao userQuery = new User_Dao();
    private final Customer_Dao customerQuery = new Customer_Dao();

    public boolean saveCustomer(Role_Entity role, User_Entity user, Customer_Entity customer) {

        if (user.getFullName().isEmpty() || !user.getEmail().contains("@") || user.getPhone().length() < 10) {
            return false;
        }

        try {
            roleQuery.saveRole(role);
            userQuery.saveUser(user);
            customerQuery.saveCustomer(customer);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
