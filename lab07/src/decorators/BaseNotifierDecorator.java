package decorators;

import residents.Resident;

public class BaseNotifierDecorator implements InterfaceNotifier {
    private final InterfaceNotifier wrapped;

    public BaseNotifierDecorator(InterfaceNotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void sendNotification(Resident resident, String message) {
        wrapped.sendNotification(resident, message);
    }
}
