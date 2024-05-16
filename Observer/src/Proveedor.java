public class Proveedor implements Subscriber{
    private String nombre;
    private String duenio;
    private String rubro;
    private String[] productos;

    public Proveedor(String nombre, String duenio, String rubro, String[] productos) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.rubro = rubro;
        this.productos = productos;
    }
    public String proveerProducto(){
        return "Soy un producto.";
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDuenio() {return duenio;}
    public void setDuenio(String duenio) {this.duenio = duenio;}
    public String getRubro() {return rubro;}
    public void setRubro(String rubro) {this.rubro = rubro;}
    public String[] getProductos() {return productos;}
    public void setProductos(String[] productos) {this.productos = productos;}

    @Override
    public void update(String message) {
        System.out.println("Oferta que no te puedes perder");
    }
}
