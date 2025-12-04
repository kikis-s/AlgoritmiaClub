package Service;

import java.util.Scanner;


public class RegistroService {
    public static void RegistroS() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Da un correo: ");
        String correo = sca.nextLine();
        System.out.println("Da una contraseña: ");
        String contraseña = sca.nextLine();
        System.out.println("Da un nombre de usuario: ");
        String nombre = sca.nextLine();
        sca.close();
    }

}
