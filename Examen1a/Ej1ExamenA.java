package junio;

import java.util.Scanner;

public class Ej1ExamenA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Venta de Entradas CineCampa");

        System.out.print("Número de Entradas: ");
        double numEntradas = Integer.parseInt(s.nextLine());
        System.out.print("Día de la semana (en minúsculas y sin acentos): ");
        String dia = s.nextLine().toLowerCase();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        String tarjeta = s.nextLine();

        double precioEntrada = 8;
        double descuentoTarjeta = 0;
        double descuento;
        double subTotal = 1;

        switch (tarjeta) {
            case "s":
                descuentoTarjeta = 0.1;
                break;
            case "n":
                descuentoTarjeta = 0;
                break;
        }

        switch (dia) {
            case "lunes":
                System.out.println();
                subTotal = (numEntradas * precioEntrada);
                break;
            case "martes":
                System.out.println();
                subTotal = (numEntradas * precioEntrada);
                break;
            case "miercoles":
                System.out.println();
                precioEntrada = 5;
                subTotal = (numEntradas * precioEntrada);
                break;
            case "jueves":
                System.out.println();
                if ((numEntradas % 2) == 0) {
                    precioEntrada = 5.5;
                    subTotal = (numEntradas * precioEntrada);
                } else {
                    double pares = (numEntradas - 1);
                    double precioPares = (pares * 5.5);
                    double suma = (precioPares + 8);
                    subTotal = suma;
                }
                break;
            case "viernes":
                System.out.println();
                subTotal = (numEntradas * precioEntrada);
                break;
            case "sabado":
                System.out.println();
                subTotal = (numEntradas * precioEntrada);
                break;
            case "domingo":
                System.out.println();
                subTotal = (numEntradas * precioEntrada);
                break;
        }

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
        
        System.out.printf("Entradas:        %8.0f\n", numEntradas);
        System.out.printf("Precio Unitario: %8.2f€\n", precioEntrada);
        System.out.printf("Total:           %8.2f€\n", subTotal);
        
        descuento = (subTotal * descuentoTarjeta);
        double total = (subTotal - descuento);
        
        System.out.printf("Descuento:       %8.2f€\n", descuento);
        System.out.printf("A pagar:         %8.2f€\n", total);
    }
}
