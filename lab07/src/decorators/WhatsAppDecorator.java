package decorators;

import residents.Resident;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(InterfaceNotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void sendNotification(Resident resident, String message){
        super.sendNotification(resident, message);
        System.out.println("Sending by WhatsApp to "+resident.getPhoneNumber()+": "+message);
    }
}
