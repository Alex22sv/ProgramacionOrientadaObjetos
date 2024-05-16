package decorators;

import residents.Resident;

public class EmailDecorator extends BaseNotifierDecorator {
    public EmailDecorator(InterfaceNotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void sendNotification(Resident resident, String message){
        super.sendNotification(resident, message);
        System.out.println("Sending by email to "+resident.getEmail()+": "+message);
    }
}
