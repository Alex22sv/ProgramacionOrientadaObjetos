package decorators;

import residents.Resident;

public class Notifier implements InterfaceNotifier {
    public Notifier(){}
    @Override
    public void sendNotification(Resident resident, String message) {
        System.out.println("Sending by SMS to "+resident.getNames()+": "+message);
    }
}
