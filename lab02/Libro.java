public class Libro {
    private String isbn;
    private String nombre;
    private String autor;
    private int paginas;

    public Libro(isbn, nombre, autor, paginas){
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }
    public Libro(){
        isbn = "";
    }
    public String getIsbn(){ return isbn; }
    public String getNombre(){ return nombre; }
    public String getAutor(){ return autor; }
    public int getPaginas(){ return paginas; }
    public void setIsbn(String isbn){ this.isbn = isbn; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setAutor(String autor){ this.autor = autor; }
    public void setPaginas(int paginas){ this.paginas = paginas; }
}