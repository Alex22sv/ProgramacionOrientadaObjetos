public class BasicNotification implements Notification {
    @Override
    public void enviar(String msg) {
        System.out.println("Mensaje enviado: " + msg);
    }
}
