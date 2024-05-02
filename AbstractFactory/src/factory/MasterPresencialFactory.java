package factory;

import estudios.MasterStudent;
import estudios.Student;
import modalidad.Modalidad;
import modalidad.ModalidadPresencial;

public class MasterPresencialFactory implements StudentModelFactory{
    // Esta otra forma de hacerlo puede ser útil cuando se construyen cosas que no se hagan todos los días, para una universidad no conviene, pero para un país para crear países sale mejor
    // private Student student;
    // private Modalidad modalidad;
    @Override
    public Student createStudent() {
        // this.student = new MasterStudent();
        return new MasterStudent();
    }

    @Override
    public Modalidad createModalidad() {
        // this.modalidad = new ModalidadPresencial();
        return new ModalidadPresencial();
    }
}
