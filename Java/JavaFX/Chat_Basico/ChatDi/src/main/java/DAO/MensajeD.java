package DAO;

import Modelo.PaqueteM;
import Persistencia.ConexionB;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MensajeD {

    public static void guardarMensaje(PaqueteM p) {

        String sql = """
        INSERT INTO mensaje
        (idEmisor, idReceptor, tipo, estado, contenido, datos)
        VALUES (?, ?, ?, ?, ?, ?)
    """;

        try (Connection c = ConexionB.getConexion();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, p.getIdEmisor());
            ps.setInt(2, p.getIdReceptor());
            ps.setString(3, p.getTipoMensaje().name());
            ps.setString(4, "Enviado");

            if (p.getTipoMensaje() == PaqueteM.TipoMensaje.TEXTO ||
                    p.getTipoMensaje() == PaqueteM.TipoMensaje.EMOTICON) {
                ps.setString(5, p.getContenido());
                ps.setNull(6, java.sql.Types.BLOB);
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR);
                ps.setBytes(6, p.getDatos());
            }

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void guardarTexto(long idMensaje, String contenido)
            throws SQLException {

        String sql = "INSERT INTO mensaje_texto (idmensaje, contenido) VALUES (?, ?)";

        try (Connection c = ConexionB.getConexion();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, idMensaje);
            ps.setString(2, contenido);
            ps.executeUpdate();
        }
    }

    private static void guardarArchivo(long idMensaje, PaqueteM p)
            throws SQLException {

        String sql = "INSERT INTO mensaje_general (idmensaje, nombre_archivo, ruta, tipo, tamanio) VALUES (?, ?, ?, ?, ?)";

        String ruta = guardarEnDisco(p.getNombreArchivo(), p.getDatos());

        try (Connection c = ConexionB.getConexion();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setLong(1, idMensaje);
            ps.setString(2, p.getNombreArchivo());
            ps.setString(3, ruta);
            ps.setString(4, p.getTipoMensaje().name());
            ps.setLong(5, p.getDatos().length);
            ps.executeUpdate();
        }
    }

    public static List<PaqueteM> historial(int idemisor, int idreceptor) {

        List<PaqueteM> lista = new ArrayList<>();

        String sql = """
        SELECT idEmisor, idReceptor, tipo, fecha_envio, datos, contenido
        FROM mensaje
        WHERE (idEmisor = ? AND idReceptor = ?)
           OR (idEmisor = ? AND idReceptor = ?)
        ORDER BY fecha_envio ASC
    """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, idemisor);
            ps.setInt(2, idreceptor);
            ps.setInt(3, idreceptor);
            ps.setInt(4, idemisor);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PaqueteM p = new PaqueteM();
                p.setTipoOperacion(PaqueteM.TipoOperacion.MENSAJE);
                p.setIdEmisor(rs.getInt("idEmisor"));
                p.setIdReceptor(rs.getInt("idReceptor"));
                p.setTipoMensaje(
                        PaqueteM.TipoMensaje.valueOf(
                                rs.getString("tipo").toUpperCase()
                        )
                );

                p.setContenido(rs.getString("contenido"));
                p.setDatos(rs.getBytes("datos"));

                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static List<PaqueteM> obtenerHistorial(int u1, int u2) {
        List<PaqueteM> lista = new ArrayList<>();

        String sql = """
        SELECT m.idEmisor, m.idReceptor, m.tipo, t.contenido
        FROM mensaje m
        LEFT JOIN mensaje_texto t ON m.id = t.idmensaje
        WHERE (idEmisor=? AND idReceptor=?)
           OR (idEmisor=? AND idReceptor=?)
        ORDER BY m.id
    """;

        try (Connection c = ConexionB.getConexion();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, u1);
            ps.setInt(2, u2);
            ps.setInt(3, u2);
            ps.setInt(4, u1);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PaqueteM p = PaqueteM.texto(
                        rs.getInt("idEmisor"),
                        rs.getInt("idReceptor"),
                        rs.getString("contenido")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    private static String guardarEnDisco(String nombre, byte[] datos)
            throws SQLException {

        try {
            File dir = new File("media");
            if (!dir.exists()) dir.mkdirs();

            String nombreFinal = System.currentTimeMillis() + "_" + nombre;
            File archivo = new File(dir, nombreFinal);

            try (FileOutputStream fos = new FileOutputStream(archivo)) {
                fos.write(datos);
            }

            return archivo.getAbsolutePath();

        } catch (Exception e) {
            throw new SQLException("Error al guardar archivo en disco", e);
        }
    }

    public static void borrarHistorial(int u1, int u2) {
        String sql = """
        DELETE FROM mensaje
        WHERE (idEmisor=? AND idReceptor=?)
        OR (idEmisor=? AND idReceptor=?)
        """;

        try (Connection c = ConexionB.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, u1);
            ps.setInt(2, u2);
            ps.setInt(3, u2);
            ps.setInt(4, u1);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
