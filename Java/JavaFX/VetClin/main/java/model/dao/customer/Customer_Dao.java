package model.dao.customer;

import connection.DatabaseConnection;
import model.entity.Customer_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer_Dao {

    public void saveCustomer(Customer_Entity customer) throws SQLException {
        String sqlQuery = "INSERT INTO customer (idUser) VALUES (?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {

            stmt.setInt(1, customer.getUser().getIdUser());

            stmt.executeUpdate();
        }
    }

}