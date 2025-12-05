package UI;

import java.util.Scanner;
import Service.ServiceRyS;

public class UIMenu {
    public static void Menu() {
        Scanner sca = new Scanner(System.in);
        int salir = 1;
        do {
            try {
                System.out.println("------ Elige una opcion ------");
                System.out.println("2. Suma");
                System.out.println("1. Resta");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                int opt = sca.nextInt();
                sca.nextLine();
                switch (opt) {
                    case 2:
                        ServiceRyS.Suma();
                        break;
                    case 1:
                        ServiceRyS.Resta();
                        break;
                    case 0:
                        System.out.println("------ Saliendo del programa ------");
                        salir = 0;
                        break;
                    default:
                        System.out.println("!! DATO NO VALIDO ¡¡");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                salir = 0;
            }
        } while (salir != 0);
        sca.close();
    }
}
