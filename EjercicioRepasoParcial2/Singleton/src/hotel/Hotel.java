package hotel;

import hotel.roomsfactory.RoomFactory;
import hotel.roomsfactory.rooms.Room;
import personas.Administrador;
import personas.Cliente;

import java.util.Vector;

public class Hotel {
    private static Hotel instance;
    private String nombre;
    private Administrador admin;
    private Vector<Cliente> clientes;
    private Vector<Vector<Room>> cuartos;

    private Hotel(String nombre, Administrador admin, Vector<Cliente> clientes, int N) {
        this.nombre = nombre;
        this.admin = admin;
        this.clientes = clientes;
        // N es el tamaño de la matriz
        // Inicializamos el terreno
        this.cuartos = new Vector<>();
        for(int i = 0; i < N; i++) {
            this.cuartos.add(new Vector<>());
        }
        for(Vector<Room> vector: cuartos){
            for(int i = 0; i < N; i++) {
                vector.add(null);
            }
        }
    }
    public static Hotel getInstancia(){
        if(instance == null){
            Administrador administrador = new Administrador("Juan Pérez", 34, "Montreal", "jperese", "1234", 101, "Gerente");
            Vector<Cliente> vectorCliente = new Vector<Cliente>();
            vectorCliente.add(new Cliente("Diego Monterrosa", 22, "San Vicente", "dmonterrosa", "password", 1200.00, "good", 2, "", ""));
            instance = new Hotel("Skyloft", administrador, vectorCliente, 5);
        }
        return instance;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public Administrador getAdmin() {return admin;}
    public void setAdmin(Administrador admin) {this.admin = admin;}
    public Vector<Cliente> getClientes() {return clientes;}
    public void setClientes(Vector<Cliente> clientes) {this.clientes = clientes;}
    public Vector<Vector<Room>> getCuartos() {return cuartos;}
    public void setCuartos(Vector<Vector<Room>> cuartos) {this.cuartos = cuartos;}
}
