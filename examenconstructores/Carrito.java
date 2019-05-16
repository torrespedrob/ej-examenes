package examenconstructores;

import java.util.ArrayList;

public class Carrito {
    private ArrayList <Elemento> e = new ArrayList<>();
    

    public void agrega(Elemento elemento) {
       e.add(elemento);
    }
    
    public int numeroDeElementos() {
        
        return e.size();
    }
    public double importeTotal() {
        double suma = 0;
        
        for (Elemento elemento : e) {
        suma += e.getPrecio() * e.getCantidad();
        }
           
        
        return suma;
        
  
    }
    @Override
    public String toString() {
        String pintar = "Contenido del carrito \n====";
        for (Elemento e : e) {
            pintar += e +"\n";
        }
        return pintar;
    }
}
