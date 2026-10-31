package model.dao.Role_Dao;

import connection.DatabaseConnection;
import model.entity.Role_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Role_Dao {

    public void saveRole(Role_Entity role) throws SQLException {
        String sqlQuery = "INSERT INTO user (fullName) VALUES (?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, role.getName());

            stmt.executeUpdate();
        }
    }

}
