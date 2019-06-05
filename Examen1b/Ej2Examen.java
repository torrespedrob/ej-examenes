package junio;
import java.util.Scanner;

public class Ej2Examen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int mov;
        
        int numDigitos = 1;
        int numEntrada;
        
        System.out.print("Introduzca un número: ");
        numEntrada = Integer.parseInt(s.nextLine());
        num = numEntrada;
        mov = num%10;
        num /= 10;
        
        while (num > 10) {
            num /= 10;
            numDigitos++;
        }
        
        int proceso = mov;
        for(; numDigitos>0; numDigitos--){
            proceso *= 10;
        }
        
        int numFin = proceso + (numEntrada/10);
        System.out.println("El número resultado es :" + numFin);
    }
}