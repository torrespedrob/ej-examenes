package junio;
import java.util.Scanner;

public class Ej3Examen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la figura: ");
        
        int entrada = Integer.parseInt(s.nextLine());
        int planta = entrada;
        int espacios;
        int asteriscos;
        
        while (planta >= 0) {
            espacios = entrada-planta;
            asteriscos = entrada-espacios;
            for(;espacios >= 0; espacios--){
                System.out.print(" ");
            }
            
            for(;asteriscos > 0; asteriscos--){
                System.out.print("*");
            }
            
            System.out.println();
            planta--;
        }
    }
}