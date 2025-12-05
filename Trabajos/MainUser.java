import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sca.nextLine();
        System.out.println("da la edad: ");
        int edad = sca.nextInt();
        sca.nextLine();
        System.out.println("da el correo: ");
        String correo = sca.nextLine();
        Usuario u1 = new Usuario(nombre, edad, correo);
        u1.setNombre(nombre);
        u1.setEdad(edad);
        u1.setCorreo(correo);
        System.out.println("el nombre es: " + u1.getNombre() + " la edad es:" + u1.getEdad() + " el correo es: " + u1.getCorreo());

    }
}
