package Models;

public class Mods {
    private String juego;
    private String descripcion;
    private String nombre;

    Mods() {
    }

    public Mods(String juego, String descripcion, String nombre) {
        this.juego = juego;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mods [juego=" + juego + ", descripcion=" + descripcion + ", nombre=" + nombre + "]";
    }

}
