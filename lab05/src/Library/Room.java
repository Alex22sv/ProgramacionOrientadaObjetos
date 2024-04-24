package Library;

import Enums.RoomType;
import Enums.Floor;

public class Room {
    private int identifier;
    private int capacity;
    private Floor floor;
    private RoomType roomType;
    private boolean isReserved;
    public Room(){
        this.identifier = -1;
        this.capacity = -1;
        this.floor = null;
        this.roomType = null;
        this.isReserved = false;
    }
    public Room(int identifier, int capacity, Floor floor, RoomType roomType, boolean isReserved) {
        this.identifier = identifier;
        this.capacity = capacity;
        this.floor = floor;
        this.roomType = roomType;
        this.isReserved = isReserved;
    }

    public int getIdentifier() {return identifier;}
    public void setIdentifier(int identifier) {this.identifier = identifier;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public Floor getFloor() {return floor;}
    public void setFloor(Floor floor) {this.floor = floor;}
    public RoomType getRoomType() {return roomType;}
    public void setRoomType(RoomType roomType) {this.roomType = roomType;}
    public boolean isReserved() {return isReserved;}
    public void setReserved(boolean reserved) {isReserved = reserved;}
}