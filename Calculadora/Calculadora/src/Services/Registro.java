package Services;

import Models.User;
import java.util.Scanner;

public class Registro {
    public static void registrarUsuario() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sca.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String password = sca.nextLine();
        System.out.println("Ingrese el correo: ");
        String correo = sca.nextLine();

        User u1 = new User();
        u1.setNombre(nombre);
        u1.setPassword(password);
        u1.setCorreo(correo);
        sca.close();
    }

}
