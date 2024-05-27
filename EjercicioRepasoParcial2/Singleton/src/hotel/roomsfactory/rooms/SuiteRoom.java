package hotel.roomsfactory.rooms;

public class SuiteRoom extends Room{
    private final int numJacuzzi = 1;

    public SuiteRoom(int capacidad, String roomID) {
        super(capacidad, roomID);
    }

    @Override
    public void descripcion() {
        System.out.println("Cuarto grande con una cama matriomonial, 2 pequeñas y 1 jacuzzi.");
    }

    @Override
    public void funcionalidad() {
        System.out.println("Con jacuzzi");

    }
    public int getNumJacuzzi() {
        return numJacuzzi;
    }
}
