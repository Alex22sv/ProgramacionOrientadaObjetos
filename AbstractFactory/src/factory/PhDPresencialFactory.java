package factory;

import estudios.PhDStudent;
import estudios.Student;
import modalidad.Modalidad;
import modalidad.ModalidadPresencial;

public class PhDPresencialFactory implements StudentModelFactory{
    @Override
    public Student createStudent() {
        return new PhDStudent();
    }

    @Override
    public Modalidad createModalidad() {
        return new ModalidadPresencial();
    }
}
