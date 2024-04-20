import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    public Biblioteca(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public void addLibro(Libro libro){
        libros.add(libro);
        GeneradorISBN.nuevoISBN();
    }
    public ArrayList<Libro> getLibros(){
        return libros;
    }
    

}