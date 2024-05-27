package hotel.roomsfactory;

import hotel.roomsfactory.rooms.Room;
import hotel.roomsfactory.rooms.SuiteRoom;

public class SuiteRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(int capacity, String ID) {
        return new SuiteRoom(capacity, ID);
    }
}
