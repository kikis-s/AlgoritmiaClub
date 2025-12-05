package Service;

import Models.SyR;
import java.util.Scanner;

public class ServiceRyS {
    public static void Resta() {

        Scanner sca = new Scanner(System.in);
        System.out.println("------ Realizando una Resta ------");
        System.out.print("Da el primer numero: ");
        int n1 = sca.nextInt();
        System.out.print("Da el segundo numero: ");
        int n2 = sca.nextInt();
        sca.nextLine();
        SyR r = new SyR();
        r.setN1(n1);
        r.setN2(n2);

        System.out.println("La Resta de los numeros es: " + (r.getN1() - r.getN2()));

    }

    public static void Suma() {

        Scanner sca = new Scanner(System.in);
        System.out.println("------ Realizando una Suma ------");
        System.out.print("Da el primer numero: ");
        int n1 = sca.nextInt();
        System.out.print("Da el segundo numero: ");
        int n2 = sca.nextInt();
        sca.nextLine();
        SyR s = new SyR();
        s.setN1(n1);
        s.setN2(n2);

        System.out.println("La Suma de los numeros es: " + (s.getN1() + s.getN2()));

    }
}
