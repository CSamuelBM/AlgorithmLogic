package DAO;

import Modelo.PaqueteM;
import Modelo.UsuarioM;
import Persistencia.ConexionB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioD {

    public static boolean crear(String nombre, String password, String email, byte[] avatar) {
        String sql = "INSERT INTO usuario (nombre, password_hash, email, avatar) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionB.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, password);
            ps.setString(3, email);
            if (avatar != null) {
                ps.setBytes(4, avatar);
            } else {
                ps.setNull(4, java.sql.Types.BLOB);
            }

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) return false;
            throw new RuntimeException("Error al crear usuario: " + e.getMessage());
        }
    }

    public static UsuarioM login(String nombre, String password) {
        String sql = "SELECT idusuario, nombre, avatar, estado " +
                "FROM usuario WHERE nombre = ? AND password_hash = ?";
        try (Connection conn = ConexionB.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new UsuarioM(
                        rs.getInt("idusuario"),
                        rs.getString("nombre"),
                        rs.getString("estado"),
                        rs.getBytes("avatar")
                );
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException("Error en login: " + e.getMessage());
        }
    }

    public static void actualizarFoto(int idUsuario, byte[] foto) {
        String sql = "UPDATE usuario SET avatar = ? WHERE idusuario = ?";

        try (Connection conn = ConexionB.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            if (foto != null)
                ps.setBytes(1, foto);
            else
                ps.setNull(1, java.sql.Types.BLOB);

            ps.setInt(2, idUsuario);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar foto: " + e.getMessage());
        }
    }

    public static boolean existeNombre(String nombre) {
        String sql = "SELECT COUNT(*) FROM usuario WHERE nombre = ?";
        try (Connection conn = ConexionB.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1) > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void cambiarEstado(int idUsuario, PaqueteM.EstadoUsuario estado) {
        String estadoBD = switch (estado) {
            case DISPONIBLE -> "Disponible";
            case AUSENTE -> "Ausente";
            case OCUPADO -> "Ocupado";
            case NO_DISPONIBLE -> "No Disponible";
            case INVISIBLE -> "Invisible";
        };

        String sql = " UPDATE usuario SET estado = ? WHERE idusuario = ? ";

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, estadoBD);
            ps.setInt(2, idUsuario);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static UsuarioM obtenerUsuarioEmail(String email) {
        String sql = "SELECT idusuario, nombre, avatar FROM usuario WHERE email = ?";

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                return new UsuarioM(
                        rs.getInt("idusuario"),
                        rs.getString("nombre"),
                        null,
                        rs.getBytes("avatar")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static UsuarioM obtenerUsuarioId(int id) {
        String sql = "SELECT idusuario, nombre, avatar FROM usuario WHERE idusuario = ?";

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new UsuarioM(
                        rs.getInt("idusuario"),
                        rs.getString("nombre"),
                        null,
                        rs.getBytes("avatar")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
