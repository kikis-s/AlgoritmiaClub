public class Integrante {
    private int id;
    private String nombre;
    private int edad;
    private String rol;
    private String habilidad;
    Integrante(){}
    Integrante(int id, String nombre, int edad, String rol, String habilidad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
        this.habilidad = habilidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }    
}
