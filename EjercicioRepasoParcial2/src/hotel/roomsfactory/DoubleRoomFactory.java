package hotel.roomsfactory;

import hotel.roomsfactory.rooms.DoubleRoom;
import hotel.roomsfactory.rooms.Room;

public class DoubleRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new DoubleRoom(capacity, ID);
    }
}
