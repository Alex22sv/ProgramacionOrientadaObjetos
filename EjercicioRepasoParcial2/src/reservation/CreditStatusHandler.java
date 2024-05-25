package reservation;

import hotel.Reserva;
import hotel.roomsfactory.rooms.Room;
import personas.Cliente;

public class CreditStatusHandler extends Handler{
    @Override
    public boolean handle(Cliente cliente, Reserva reserva, Room room) {
        if(cliente.getCreditStatus()=="good"){
            if(next!=null){
                return next.handle(cliente, reserva, room);
            } else return true;
        } else {
            return false;
        }
    }
}
