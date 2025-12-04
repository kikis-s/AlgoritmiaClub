package Models;

public class Games {
    private String titulo;
    private double precio;
    private String descripcion;
    private String genero;

    Games() {
    }

    public Games(String titulo, double precio, String descripcion, String genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Games [titulo=" + titulo + ", precio=" + precio + ", descripcion=" + descripcion + ", genero=" + genero
                + "]";
    }

}
