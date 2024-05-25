package hotel.roomsfactory;

import hotel.roomsfactory.rooms.Room;
import hotel.roomsfactory.rooms.SingleRoom;

public class SIngleRoomFactory implements  RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new SingleRoom(capacity, ID);
    }
}
