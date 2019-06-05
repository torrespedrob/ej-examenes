package junio;

import java.util.Scanner;

public class Ej2ExamenA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numEntrada = Integer.parseInt(s.nextLine());

        int resultadoFinal = 0;

        int apoyo1 = numEntrada;
        int apoyo2 = 0;
        int apoyo3 = 0;
        int apoyo4 = 0;

        int numeroRotado = 0;
        int primeraCifra = 0;
        int longitudNumero = 1;

        if ((numEntrada >= 0) && (numEntrada <= 9)) {
            resultadoFinal = numEntrada;
        } else {
            while (apoyo1 > 0) {
                numeroRotado = ((numeroRotado * 10) + (apoyo1 % 10));
                apoyo1 /= 10;
                longitudNumero *= 10;
            }
            longitudNumero /= 10;
            primeraCifra = (numeroRotado % 10);
            apoyo2 = (primeraCifra * longitudNumero);
            apoyo3 = (numEntrada - apoyo2);
            apoyo4 = (apoyo3 *= 10);
            resultadoFinal = (apoyo4 + primeraCifra);
        }

        System.out.println("El número resultado es: " + resultadoFinal);
    }
}
