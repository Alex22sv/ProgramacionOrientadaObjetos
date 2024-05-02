package modalidad;

public class ModalidadPresencial implements Modalidad{
    @Override
    public void getEnrollmentSteps() {
        System.out.println("Ventanilla, tesorería");
    }

    @Override
    public void getEquipmentRequirements() {
        System.out.println("Cuaderno");
    }

    @Override
    public void getSchedule() {
        System.out.println("day ");
    }
}
