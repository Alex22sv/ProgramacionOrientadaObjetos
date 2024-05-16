public class CEO extends Empleado {
    public CEO(Mediator mediator, String ID, String nombre, String cargo) {
        super(mediator, ID, nombre, cargo);
    }

    @Override
    public void sendMessage(String message, String to) {
        getMediator().notify(message, to, getID());
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("CEO: Mensaje recibido ["+message+" ]");
    }
}