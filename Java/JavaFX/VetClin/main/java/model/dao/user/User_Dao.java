package model.dao.user;

import connection.DatabaseConnection;
import model.entity.User_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User_Dao {

    public void saveUser(User_Entity user) throws SQLException {
        String sqlQuery = "INSERT INTO user (fullName, email, phone, birthday, role) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, user.getFullName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPhone());
            stmt.setObject(4, user.getBirthday());
            stmt.setInt(5, user.getRole().getIdRole());

            stmt.executeUpdate();
        }
    }

    public void consultUser(String fullName, String email) throws SQLException {
        String sqlQuery = "SELECT u.idRole FROM user as u WHERE u.fullName = fullName AND u.email = email";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {

        }
    }

}
