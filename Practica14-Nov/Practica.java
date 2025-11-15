import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        boolean x = true;
        boolean y = true;
        boolean z = true;
        int num1, num2;
        double num3, num4;
        do {
            try {
                System.out.println("¿Deseas registrarte?");
                System.out.println("1. Si");
                System.out.println("2. No");
                int reg = sca.nextInt();
                switch (reg) {
                    case 1:
                        System.out.println("Registra Nombre:");
                        sca.nextLine();
                        String nombre = sca.nextLine();
                        System.out.println("Registra Correo");
                        String correo = sca.nextLine();
                        System.out.println("Registra contraseña:");
                        String contraseña = sca.nextLine();
                        User u = new User();
                        u.setNombre(nombre);
                        u.setCorreo(correo);
                        u.setContraseña(contraseña);
                        do {
                            try {
                                System.out.println("¿Deseas Iniciar sesion?");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                int ses = sca.nextInt();
                                switch (ses) {
                                    case 1:
                                        System.out.println("Bien, inicia sesion para continuar");
                                        System.out.println("Correo");
                                        sca.nextLine();
                                        String sesionCorreo = sca.nextLine();
                                        System.out.println("Contraseña");
                                        String sesionContraseña = sca.nextLine();
                                        if (sesionCorreo.equals(u.getCorreo())
                                                && sesionContraseña.equals(u.getContraseña())) {
                                            do {
                                                try {
                                                    System.out.println("= = = Bienvenido " + u.getNombre() + " = = =");
                                                    System.out.println("¿Que desea hacer?");
                                                    System.out.println("1. Sumar");
                                                    System.out.println("2. Multiplicar");
                                                    System.out.println("3. Dividir");
                                                    System.out.println("4. Modulo");
                                                    System.out.println("5. Retroceder al inicio de sesion");
                                                    System.out.println("6. Salir por completo del programa");
                                                    int opt = sca.nextInt();
                                                    switch (opt) {
                                                        case 1:
                                                            System.out.println("= = SUMA = =");
                                                            System.out.println("Dame el primer numero");
                                                            num1 = sca.nextInt();
                                                            System.out.println("Dame el segundo numero");
                                                            num2 = sca.nextInt();
                                                            System.out.println("La suma es: " + suma(num1, num2));
                                                            break;
                                                        case 2:
                                                            System.out.println("= = MULTIPLICACION = =");
                                                            System.out.println("Dame el primer numero");
                                                            num1 = sca.nextInt();
                                                            System.out.println("Dame el segundo numero");
                                                            num2 = sca.nextInt();
                                                            System.out.println(
                                                                    "La multiplicacion es: " + multi(num1, num2));
                                                            break;
                                                        case 3:
                                                            System.out.println("= = DIVISION = =");
                                                            System.out.println("Dame el primer numero");
                                                            num3 = sca.nextInt();
                                                            System.out.println("Dame el segundo numero");
                                                            num4 = sca.nextInt();
                                                            System.out.println("La division es: " + divi(num3, num4));
                                                            break;
                                                        case 4:
                                                            System.out.println("nada aca aun");
                                                            break;
                                                        case 5:
                                                            System.out.println("Retrocediendo al inicio de sesion");
                                                            z = false;
                                                            break;
                                                        case 6:
                                                            System.out.println(
                                                                    "= = = = SALIENDO POR COMPLETO DEL PROGRAMA = = = =");
                                                            System.exit(0);
                                                            break;

                                                        default:
                                                            System.out.println("= = = Dato invalido = = =");
                                                            break;
                                                    }
                                                } catch (Exception err) {
                                                    System.out.println(err);
                                                }
                                            } while (z == true);
                                        } else {
                                            System.out.println("= = = Un datos es incorrecto o mas = = =");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("= = = Saliendo al registro = = =");
                                        y = false;
                                        break;
                                    default:
                                        System.out.println("= = = Dato invalido = = =");
                                        break;
                                }
                            } catch (Exception er) {
                                System.out.println(er);
                            }
                        } while (y == true);

                        break;
                    case 2:
                        System.out.println("= = = Saliendo del programa = = =");
                        x = false;
                        break;
                    default:
                        System.out.println("= = = Dato invalido = = =");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (x == true);
        sca.close();
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static double divi(double num3, double num4) {
        return num3 / num4;
    }
}
