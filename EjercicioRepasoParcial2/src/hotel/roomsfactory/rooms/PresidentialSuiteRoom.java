package hotel.roomsfactory.rooms;

public class PresidentialSuiteRoom extends Room{
    private final int numJacuzzi = 2;
    private final int numBaths = 3;
    private final int numSauna = 1;

    public PresidentialSuiteRoom(int capacidad, String roomID) {
        super(capacidad, roomID);
    }

    @Override
    public void descripcion() {
        System.out.println("Todo");
    }

    @Override
    public void funcionalidad() {
        System.out.println("Lo que quieras");
    }


    public int getNumJacuzzi() {return numJacuzzi;}
    public int getNumBaths() {return numBaths;}
    public int getNumSauna() {return numSauna;}
}
