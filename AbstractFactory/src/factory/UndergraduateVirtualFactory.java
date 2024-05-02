package factory;

import estudios.Student;
import estudios.UndergraduateStudent;
import modalidad.Modalidad;
import modalidad.ModalidadVirtual;

public class UndergraduateVirtualFactory implements StudentModelFactory{

    @Override
    public Student createStudent() {
        return new UndergraduateStudent();
    }

    @Override
    public Modalidad createModalidad() {
        return new ModalidadVirtual();
    }
}
