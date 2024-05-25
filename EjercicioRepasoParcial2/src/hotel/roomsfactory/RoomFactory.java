package hotel.roomsfactory;

import hotel.roomsfactory.rooms.Room;

public interface RoomFactory {
    Room createRoom(int capacity, String ID);
