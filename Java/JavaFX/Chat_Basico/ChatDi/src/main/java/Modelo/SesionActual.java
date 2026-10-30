package Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SesionActual {

    private static UsuarioM usuario;

    public static void setUsuario(UsuarioM u) { usuario = u; }
    public static UsuarioM getUsuario() { return usuario; }

    public static String getNombre() { return usuario != null ? usuario.getNombre() : ""; }

    public static byte[] getFoto() { return usuario != null ? usuario.getAvatar() : null; }

    public static void cerrar() { usuario = null; }

    private static final ObservableList<UsuarioM> solicitudesPendientes =
            FXCollections.observableArrayList();

    public static void agregarSolicitud(UsuarioM u) {
        solicitudesPendientes.add(u);
    }

    public static ObservableList<UsuarioM> getSolicitudesPendientes() {
        return solicitudesPendientes;
    }

    public static void limpiarSolicitudes() {
        solicitudesPendientes.clear();
    }


}
