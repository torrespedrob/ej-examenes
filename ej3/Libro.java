package ej3;

public class Libro extends Publicacion implements Prestable {

    boolean prestado = false;

    public Libro(String isbn, String titulo, int fecha) {
        super(isbn, titulo, fecha);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
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
    public void presta() {
        if (prestado) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        } else {
            prestado = true;
        }

    }

    @Override
    public void devuelve() {
        prestado = false;

    }

    @Override
    public boolean estaPrestado() {
        return (prestado);
    }

    @Override
    public String toString() {
        String prestamo;
        if (prestado) {
            prestamo = " (prestado)";
        } else {
            prestamo = " (no prestado)";
        }
        String resultado = "ISBN: " + this.isbn + ", título: " + this.titulo + ", año de publicación: " + this.fecha + prestamo;

        return resultado;
    }

}
