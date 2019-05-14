package bucle;
import java.util.ArrayList;

public class Bucle {
    public static void main(String[] args) {
        /*Crear un array de 10 elementos y rellenarlo con números aleatorios, entre 0 y 100.
        Calcular la suma de todos los elementos*/
        ArrayList<Integer> array = new ArrayList<>();

        int i = 0;
        int suma = 0;
        int numeros = 10;

        do {
            i++;

            int aleatorio = (int) (Math.random() * 100 + 1);
            array.add(aleatorio);

        } while (i < numeros);

        for (int creado : array) {
            suma = suma + creado;

        }
        System.out.println("Se han creado " + array.size() + " números aleatorios");
        System.out.println("La suma de esos números aleatorios , entre 0 y 100, equivale a: " + suma);
    }

}
