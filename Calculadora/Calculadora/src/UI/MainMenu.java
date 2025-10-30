package UI;

import java.util.Scanner;
import Services.Registro;

public class MainMenu {
    public static void mainMenu() {
        Scanner sca = new Scanner(System.in);
        System.out.println("= = = Bienvenido = = =");
        System.out.println("1. Registro ");
        System.out.println("2. Iniciar sesion ");
        System.out.println("-----------------------");
        System.out.println("0. Salir ");
        boolean ft = true;
        do {
            try {
                int opt = sca.nextInt();
                switch (opt) {
                    case 0:
                        System.out.println("Saliendo.... ");
                        ft = false;
                        break;
                    case 1:
                        Registro.registrarUsuario();
                        break;
                    case 2:

                        break;
                    default:
                        System.out.println("Dato no valido");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (ft);
        sca.close();
    }
}
