public abstract class Empleado {
    private Mediator mediator;
    private String ID;
    private String nombre;
    private String cargo;

    public Empleado(Mediator mediator, String ID, String nombre, String cargo){
        this.mediator = mediator;
        this.ID = ID;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public Mediator getMediator() {return mediator;}
    public void setMediator(Mediator mediator) {this.mediator = mediator;}
    public String getID() {return ID;}
    public void setID(String ID) {this.ID = ID;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public abstract void sendMessage(String message, String to);
    public abstract void receiveMessage(String message);
}
