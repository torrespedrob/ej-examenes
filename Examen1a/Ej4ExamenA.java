package junio;
import java.util.Scanner;

public class Ej4ExamenA {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura: ");
    int entrada = Integer.parseInt(s.nextLine());
    
    int espaciosCentrales = (entrada - 2);
    int longitudEspacios = 0;
    int apoyo1 = 0;
    
    for (int i = 0; i < (entrada - 1); i++) {
      System.out.print("*");
      apoyo1++;
      
      if (apoyo1 == 1) {
        while (longitudEspacios < espaciosCentrales) {
          System.out.print("*");
          longitudEspacios++;
        }
        System.out.print("*");
      } else {
        while (longitudEspacios < espaciosCentrales) {
          System.out.print(" ");
          longitudEspacios++;
        }
        System.out.print("*");
      }
      
      System.out.println();
      longitudEspacios = 0;
      espaciosCentrales--;
    }
    System.out.println("*");
  }
}