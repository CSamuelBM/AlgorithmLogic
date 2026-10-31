package model.dao.veterinary;

import connection.DatabaseConnection;
import model.entity.Veterinary_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Veterinary_Dao {

    public void saveVeterinary(Veterinary_Entity veterinary) throws SQLException {
        String sqlQuery = "INSERT INTO veterinary (specialty, idUser) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, veterinary.getSpecialty());
            stmt.setInt(2, veterinary.getUser().getIdUser());

            stmt.executeUpdate();
        }
    }

}
