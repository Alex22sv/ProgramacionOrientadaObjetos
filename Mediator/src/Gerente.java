public class Gerente extends Empleado {
    public Gerente(Mediator mediator, String ID, String nombre, String cargo) {
        super(mediator, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String message, String to){
        getMediator().notify(message, to, "gerente");
    }
    @Override
    public void receiveMessage(String message){

    }
}
