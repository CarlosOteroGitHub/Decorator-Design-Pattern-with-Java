package decorator;

public class Cuenta {
    
    private final int id_cuenta;
    private final String nombre_usuario, contrasena;

    public Cuenta(int id_cuenta, String nombre_usuario, String contrasena) {
        this.id_cuenta = id_cuenta;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}