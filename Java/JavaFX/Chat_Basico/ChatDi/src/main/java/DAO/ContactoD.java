package DAO;

import Modelo.UsuarioM;
import Persistencia.ConexionB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactoD {

    public static boolean insertarSolicitud(int idUsuario, int idContacto) {
        String sql = """
            INSERT INTO contacto (idUsuario, idContacto, estado)
            VALUES (?, ?, 'Pendiente')""";
        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ps.setInt(2, idContacto);
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062)
                return false;
            throw new RuntimeException(e);
        }
    }

    public static void bloquear(int u1, int u2) {
        String sql = """
        UPDATE contacto
        SET estado='Bloqueado'
        WHERE idUsuario=? AND idContacto=?
    """;

        try (Connection c = ConexionB.getConexion();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, u1);
            ps.setInt(2, u2);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<UsuarioM> solicitudesPendientes(int idUsuario) {
        List<UsuarioM> lista = new ArrayList<>();

        String sql = """
        SELECT u.idusuario, u.nombre, u.estado, avatar
        FROM contacto c
        JOIN usuario u ON u.idusuario = c.idUsuario
        WHERE c.idContacto = ?
        AND c.estado = 'Pendiente'
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new UsuarioM(
                        rs.getInt("idusuario"),
                        rs.getString("nombre"),
                        rs.getString("estado"),
                        null
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static List<UsuarioM> contactosAceptados(int idUsuario) {
        List<UsuarioM> lista = new ArrayList<>();

        String sql = """
        SELECT u.idusuario, u.nombre, u.estado, u.avatar
        FROM contacto c
        JOIN usuario u ON u.idusuario = c.idContacto
        WHERE c.idUsuario = ?
        AND c.estado = 'Aceptado'
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                UsuarioM u = new UsuarioM();
                u.setId(rs.getInt("idusuario"));
                u.setNombre(rs.getString("nombre"));
                u.setEstado(rs.getString("estado"));
                u.setAvatar(rs.getBytes("avatar"));

                lista.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void desbloquear(int u1, int u2) {
        String sql = """
        UPDATE contacto
        SET estado='Aceptado'
        WHERE idUsuario=? AND idContacto=?
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, u1);
            ps.setInt(2, u2);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void aceptarContacto(int idUsuario, int idContacto) {
        String sql = """
        UPDATE contacto
        SET estado = 'Aceptado'
        WHERE idUsuario = ? AND idContacto = ?
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ps.setInt(2, idContacto);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearContactoInverso(int idUsuario, int idContacto) {
        String sql = """
        INSERT INTO contacto (idUsuario, idContacto, estado)
        VALUES (?, ?, 'Aceptado')
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ps.setInt(2, idContacto);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
