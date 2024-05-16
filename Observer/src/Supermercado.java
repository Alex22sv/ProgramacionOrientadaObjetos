import java.util.ArrayList;
import java.util.Iterator;

public class Supermercado {
    private String nombre;
    private String direccion;
    private String fechaFundacion;
    private String fundador;
    private String[] productos;
    private String[] empleados;
    private String horarios;
    private Cliente[] clientes;
    private ArrayList<Subscriber> subscribers;

    public Supermercado(String nombre, String direccion, String fechaFundacion, String fundador, String horarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaFundacion = fechaFundacion;
        this.fundador = fundador;
        this.productos = productos;
        this.empleados = empleados;
        this.horarios = horarios;
        this.clientes = clientes;
    }
    public void vender(){
        System.out.println("Estoy vendiendo...");
    }
    public void comprar(){
        System.out.println("Estoy comprendo...");
    }
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(String mensaje){
        Iterator<Subscriber> iterator = subscribers.iterator();
        while(iterator.hasNext()){
            iterator.next().update(mensaje);
        }
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public String getFechaFundacion() {return fechaFundacion;}
    public void setFechaFundacion(String fechaFundacion) {this.fechaFundacion = fechaFundacion;}
    public String getFundador() {return fundador;}
    public void setFundador(String fundador) {this.fundador = fundador;}
    public String[] getProductos() {return productos;}
    public void setProductos(String[] productos) {this.productos = productos;}
    public String[] getEmpleados() {return empleados;}
    public void setEmpleados(String[] empleados) {this.empleados = empleados;}
    public String getHorarios() {return horarios;}
    public void setHorarios(String horarios) {this.horarios = horarios;}
    public Cliente[] getClientes() {return clientes;}
    public void setClientes(Cliente[] clientes) {this.clientes = clientes;}

}
