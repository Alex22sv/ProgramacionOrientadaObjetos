package factory;
import estudios.Student;
import modalidad.Modalidad;

public interface StudentModelFactory {
    public Student createStudent();
    public Modalidad createModalidad();
}
