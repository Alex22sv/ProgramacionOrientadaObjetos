package hotel.roomsfactory;

import hotel.roomsfactory.rooms.PresidentialSuiteRoom;
import hotel.roomsfactory.rooms.Room;

public class PresidentialSuiteFactory implements RoomFactory{
    @Override
    public Room createRoom(int capacity, String ID) {
        return new PresidentialSuiteRoom(capacity, ID);
    }
}
