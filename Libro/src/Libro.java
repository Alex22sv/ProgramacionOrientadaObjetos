public class Libro {
    private String titulo;
    private Autor autor;
    private String ISBN;
    private Editorial editorial;
    private String fechaPublicacion;
    private String generoLiterario;
    private int cantPaginas;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getGeneroLiterario() {
        return generoLiterario;
    }
    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
    public int getCantPaginas() {
        return cantPaginas;
    }
    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }
}
