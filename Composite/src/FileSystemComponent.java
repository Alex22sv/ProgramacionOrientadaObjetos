public interface FileSystemComponent {
    public String getName();
    public int getSize();
    public void dumpContents();
    // El folder es una colección de ítems, files.
    // El tamaño del folder es la suma de los tamaños de los archivos internos
}
