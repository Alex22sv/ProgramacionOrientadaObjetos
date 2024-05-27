public class EmailDecorator extends BaseDecorator{
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        System.out.println("Enviando por email:"+msg);
    }
}
