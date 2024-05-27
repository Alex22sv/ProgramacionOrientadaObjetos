public class BaseDecorator implements Notification{
    private Notification notification;

    public BaseDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void enviar(String msg) {
        notification.enviar(msg);
    }
}
