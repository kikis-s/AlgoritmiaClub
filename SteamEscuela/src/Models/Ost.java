package Models;

public class Ost {
    private String juego;
    private String titulo;
    private String duracion;
    private String genero;
    private String autor;

    Ost() {
    }

    public Ost(String juego, String titulo, String duracion, String genero, String autor) {
        this.juego = juego;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.autor = autor;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ost [juego=" + juego + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero
                + ", autor="
                + autor + "]";
    }

}
