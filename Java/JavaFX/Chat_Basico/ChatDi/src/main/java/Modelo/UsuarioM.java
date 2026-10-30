package Modelo;

import java.io.Serializable;

public class UsuarioM implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String password;
    private byte[] avatar;
    private String estado;


    public UsuarioM() { }

    public UsuarioM(int id, String nombre, String estado, byte[] avatar) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.avatar = avatar;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPassword() { return password; }

    public byte[] getAvatar() { return avatar; }
    public void setAvatar(byte[] avatar) { this.avatar = avatar; }

    public String getEstado(){ return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioM)) return false;
        UsuarioM u = (UsuarioM) o;
        return id == u.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return nombre;
    }

}
