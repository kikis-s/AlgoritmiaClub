package ActividadArrayList;

import java.util.Scanner;

public class MenuPersonal {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        String nombre = sca.nextLine();
        System.out.println("Cual es tu edad? ");
        String edad = sca.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = sca.nextLine();
        System.out.println("Cual es tu hobbie? ");
        String hobbie = sca.nextLine();
        System.out.println("En que escuela estudias? ");
        String escuela = sca.nextLine();
        System.out.println("Cual es tu estado civil? ");
        String civil = sca.nextLine();

        String[] lista = { nombre, edad, correo, hobbie, escuela, civil };
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

}
