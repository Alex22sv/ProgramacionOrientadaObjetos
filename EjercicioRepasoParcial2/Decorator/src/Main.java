public class Main {
    public static void main(String[] args) {
        BasicNotification customNotifier = new BasicNotification();
        //customNotifier.enviar("Hola");
        WhatsAppDecorator whatsapp = new WhatsAppDecorator(customNotifier);
        whatsapp.enviar("Hola mundo");


    }
}
