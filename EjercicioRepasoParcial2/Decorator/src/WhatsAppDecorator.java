public class WhatsAppDecorator extends BaseDecorator{
    public WhatsAppDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        System.out.println("Enviando por WhatsApp: "+msg);
    }
}
