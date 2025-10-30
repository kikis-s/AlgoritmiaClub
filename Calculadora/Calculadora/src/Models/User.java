package Models;

public class User {
    public User() {
    }

    public String nombre, password, correo;

    User(String nombre, String password, String correo) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "User [nombre=" + nombre + ", password=" + password + ", correo=" + correo + "]";
    }

}
