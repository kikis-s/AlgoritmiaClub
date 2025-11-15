import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Circo {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        List <Integrante> personal = new ArrayList<>();
        boolean x = true;
        do{
            try{
                System.out.println("¿Quieres registrarte?");
                System.out.println("1. Si");
                System.out.println("2. NO");
                int op = sca.nextInt();
                if(op == 2){
                    for(Integrante i: personal){
                        System.out.println(i);
                        x = false;
                    }
                }else{
                    personal.add(new Integrante());
                    int id = personal.size()+1;
                    personal.get(personal.size()-1).setId(id);
                    sca.nextLine();
                    System.out.println("¿Cual es tu nombre?");
                    personal.get(personal.size()-1).setNombre(sca.nextLine());
                    System.out.println("¿Cual es tu edad?");
                    personal.get(personal.size()-1).setEdad(sca.nextInt());
                    sca.nextLine();
                    System.out.println("¿Cual es tu rol?");
                    personal.get(personal.size()-1).setRol(sca.nextLine());
                    System.out.println("¿Cual es tu habilidad?");
                    personal.get(personal.size()-1).setHabilidad(sca.nextLine());
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }while(x == true);
        sca.close();
    }
}
