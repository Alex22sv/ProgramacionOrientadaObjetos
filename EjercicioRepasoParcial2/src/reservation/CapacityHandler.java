package reservation;

import hotel.Cuarto;
import hotel.Reserva;
import hotel.roomsfactory.rooms.Room;
import personas.Cliente;

public class CapacityHandler extends Handler{
    @Override
    public boolean handle(Cliente cliente, Reserva reserva, Room room) {
        if(reserva.getOcupantes()<=room.getCapacidad()){
            if(next!=null){
                return next.handle(cliente, reserva, room);
            } else return true;
        } else {
            return false;
        }
    }
}
