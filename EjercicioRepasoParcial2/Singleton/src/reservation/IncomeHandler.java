package reservation;

import hotel.Reserva;
import hotel.roomsfactory.rooms.Room;
import personas.Cliente;

public class IncomeHandler extends Handler{
    @Override
    public boolean handle(Cliente cliente, Reserva reserva, Room room) {
        if(cliente.getIncome()>=1800){
            if(next!=null){
                return next.handle(cliente, reserva, room);
            } else return true;
        } else {
            return false;
        }
    }
}
