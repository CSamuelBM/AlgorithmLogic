package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionB {

    private static final String SERVIDOR = "192.168.56.1";
    private static final String BASE     = "ChatDB";
    private static final String USUARIO  = "PamLid";
    private static final String PASSWORD = "MySQL1130";

    private static final String URL =
            "jdbc:mysql://" + SERVIDOR + ":3306/" + BASE +
                    "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Error al conectar con MySQL: " + e.getMessage());
        }
    }

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

}
