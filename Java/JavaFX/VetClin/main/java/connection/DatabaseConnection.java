package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/VetClin";
    private static final String USER = "PamLid";
    private static final String PASSWORD = "MySQL1130";

    public static Connection getConnection() {
       Connection connection = null;

       try {
           connection = DriverManager.getConnection(URL + USER + PASSWORD);
       } catch (Exception e) {
           throw new RuntimeException("Error al conectar con la base de datos", e);
       }

       return connection;
    }

}
