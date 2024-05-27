package reservation;

import hotel.Reserva;
import hotel.roomsfactory.rooms.Room;
import personas.Cliente;

public class AdvanceTimeHandler extends Handler{
    @Override
    public boolean handle(Cliente cliente, Reserva reserva, Room room) {
        if(reserva.getFechaIngreso().isBefore(reserva.getFechaIngreso())){
            if(next!=null){
                return next.handle(cliente, reserva, room);
            } else return true;
        } else {
            return false;
        }
    }
}
