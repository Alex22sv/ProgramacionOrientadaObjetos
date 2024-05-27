package reservation;

import hotel.Reserva;
import hotel.roomsfactory.rooms.Room;
import personas.Cliente;

public abstract class Handler {
    protected Handler next;
    public boolean handle(Cliente cliente, Reserva reserva, Room room) {
        return false;
    }

    public Handler getNext() {return next;}
    public void setNext(Handler next) {this.next = next;}

}
