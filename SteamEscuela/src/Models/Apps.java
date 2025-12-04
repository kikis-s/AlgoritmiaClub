package Models;

public class Apps {
    private String tipo;
    private String titulo;
    private double precio;
    private String descripcion;

    Apps() {
    }

    public Apps(String tipo, String titulo, double precio, String descripcion) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Apps [tipo=" + tipo + ", titulo=" + titulo + ", precio=" + precio + ", descripcion=" + descripcion
                + "]";
    }

}
