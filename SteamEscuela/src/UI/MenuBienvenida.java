package UI;

import UI.Login;
import UI.Registro;
import Service.LoginService;
import Service.RegistroService;
import java.util.Scanner;

public class MenuBienvenida {
    public static void Menu() {
        Scanner sca = new Scanner(System.in);
        do {
            try {
                System.out.println(" = = = Elige una opcion = = = ");
                System.out.println("1. Iniciar Sesion");
                System.out.println("2.  Registrarse");
                System.out.println("");
                System.out.println("=|=|=|=|=|=|=|=|=|=|=|=|=|=|=");
                System.out.println("");
                System.out.println("3. Salir");
                System.out.println("");
                System.out.println("=|=|=|=|=|=|=|=|=|=|=|=|=|=|=");
                int opt = sca.nextInt();
                switch (opt) {
                    case 1:
                    LoginService.LoginS();
                        break;
                    case 2:
                    RegistroService.RegistroS();
                        break;
                    case 3:
                    System.out.println("= = = Saliendo = = =");
                    System.exit(3);
                        break;
                    default:
                        System.out.println("= = = Dato invalido = = =");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                sca.nextLine();
            }
        } while (true);
    }
}
