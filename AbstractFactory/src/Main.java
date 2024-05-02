import estudios.Student;
import factory.PhDVirtualFactory;
import factory.StudentModelFactory;
import modalidad.Modalidad;

public class Main {
    public static void main(String[] args) {
        Student student;
        Modalidad modalidad;
        StudentModelFactory factory;
        // Supongamos que el usuario ha solicitado un doctorado en modalidad virtual
        factory = new PhDVirtualFactory();
        student = factory.createStudent();
        modalidad = factory.createModalidad();
        student.attendCourse();
        modalidad.getSchedule();

    }
}
