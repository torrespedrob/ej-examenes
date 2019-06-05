package junio;
import java.util.Scanner;

public class Ej3ExamenA {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce una altura: ");
    int h = Integer.parseInt(s.nextLine());
    
    int apoyo1 = h;
    int apoyo2 = 0;
    
    for (int i= 0; i < h; i++) {
      while (apoyo2 < apoyo1) {
        System.out.print("*");
        apoyo2++;
      }
      System.out.println();
      apoyo2 = 0;
      apoyo1--;
    }
  }
}