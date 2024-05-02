package Library;

import Enums.RoomType;
import Enums.Floor;

public class Room implements Interfaces.RoomReservation{
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
    public void displayRoomInformation(){
        System.out.println("ID: " + this.identifier);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Floor: " + this.floor);
        System.out.println("Type: " + this.roomType);
        System.out.println("Reserved: " + this.isReserved);
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

    @Override
    public void reserveRoom() {
        if(!this.isReserved){
            this.isReserved = true;
            System.out.println("The room has been reserved.");
        } else {
            System.out.println("This room is already reserved.");
        }
    }
    @Override
    public void cancelRoomReservation() {
        if(this.isReserved){
            this.isReserved = false;
            System.out.println("The room reservation has been canceled.");
        } else {
            System.out.println("The room is not reserved.");
        }
    }
    @Override
    public boolean isRoomReserved() {
        return this.isReserved;
    }
}