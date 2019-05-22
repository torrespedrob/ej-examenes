package ej3;

public class Revista extends Publicacion {
    
    int numero;

    public Revista(String isbn, String titulo, int fecha,int numero) {
        super(isbn, titulo, fecha);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {

        
        String resultado = "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.fecha ;
        
        return resultado;
    }
    
}
