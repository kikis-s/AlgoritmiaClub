import java.util.Scanner;
class Menu{
public static void main(String []args){
Scanner sca = new Scanner (System.in);

do{
	System.out.println("**Dame una opcion**");
	System.out.println("1. Multiplicacion");
	System.out.println("2. Division");
	System.out.println("3. Suma");
	System.out.println("4. Resta");
	System.out.println("5. Salir");

	int a = sca.nextInt();

	if (a==5){
	System.out.println("Saliendo...");
	break;
	}
	
	if (a==1){
	System.out.println("Ingresa un  numero; ");
	int n1 = sca.nextInt();
	System.out.println("Da otro numero: ");
	int n2 =  sca.nextInt();
	int rm = multiplicacion(n1, n2);
	System.out.println("El resultado de la multiplicacion es: " + rm);
	break;
	}

	if (a==2){
        System.out.println("Ingresa un  numero; ");
        double n1 = sca.nextDouble();
        System.out.println("Da otro numero: ");
        double n2 =  sca.nextDouble();
        double rd = division(n1, n2);
        System.out.println("El resultado de la division es: " + rd);
        break;
	}

	if(a==3){
	System.out.println("Ingresa  un numero: ");
	int n1 = sca.nextInt();
	System.out.println("Da otro numero: ");
	int n2 = sca.nextInt();
	int rs = suma(n1, n2);
	System.out.println("El resultado de la suma es: " + rs);
	break;
	}

	if(a==4){
	System.out.println("Ingrese un numero: ");
	int n1 =  sca.nextInt();
	System.out.println("Da otro numer: ");
	int n2 = sca.nextInt();
	int rr = resta(n1, n2);
	System.out.println("El resultado de la resta es; " + rr);
	break;
	}
} while(true);
}
public static int multiplicacion(int n1, int n2){
	return n1 * n2;
}
public static double division(double n1, double n2){
	return n1 / n2;
}

public static int suma(int n1, int n2){
	return n1 + n2;
}

public static int resta(int n1,int n2){
	return n1 - n2;
}
}
