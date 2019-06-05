/**
 * 
 * @author Pedro
 */

package junio;
import java.util.Scanner;
public class Ej1Examen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double precio = 0;
        double total = 0;
        double descuento = 0;
        int numParejas = 0;
        boolean salir = false;
        
        System.out.println("Venta de entradas ColiseoCampa");
        System.out.print("Número de entradas: ");
        int numeroEntradas = Integer.parseInt(s.nextLine());
        System.out.print("Día de la semana: ");
        String dia = s.nextLine().toLowerCase();
        System.out.println("¿Tiene tarjeta ColiseoCampa? (s/n): ");
        Boolean tarjeta = s.nextLine().toLowerCase().equals("s");
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "viernes":
            case "sabado":
            case "domingo":
                precio = 10.0;
                total = precio * numeroEntradas;
                break;
            case "miercoles":
                precio = 8.0;
                total = precio * numeroEntradas;
                break;
            case "jueves":
                precio = 10.0;
                numParejas = numeroEntradas/2;
                total = ((precio * (numeroEntradas-(numParejas*2))) + (15 * numParejas));
                break;
            default:
                System.out.println("Comprueba que los datos sean correctos");
                salir = true;
                break;
        }
        if (tarjeta == true && salir == false){
            descuento = total / 10;
        } else{
            descuento = 0.0;
        }
        
        //Salida de datos
        if(salir == false){
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            if(numParejas > 0){
                System.out.println("Entradas parejas \t " + numParejas + " €");
                System.out.println("Precio unitario \t15.00 €");
            }
            System.out.print("Entradas individuales \t " + (numeroEntradas-(numParejas*2)));
            System.out.println(" €");
            System.out.println("Precio unitario     \t10.00 €");
            System.out.println("Total \t\t\t" + total + " €");
            System.out.println("Descuento\t\t " + descuento + " €");
            System.out.println("A pagar \t\t" + (total-descuento) + " €");
        } else{
            System.out.println("Error. Comprueba los datos de entrada.");
        }
    }
}