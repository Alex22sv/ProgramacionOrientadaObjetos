package Empleado;
import Persona.Persona;

public class EmpleadoTemporal extends Empleado{
    public EmpleadoTemporal(Persona persona, String carnet, float salarioBase){
        inicializarEmpleado(persona, carnet, salarioBase);
    }

    @Override
    public float obtenerSalario() {
        // super apunta al padre
        // this apunta a la clase actual
        /*
        Esto es posible si salarioBase es protected:
            return salarioBase;
        */
        return getSalarioBase();
    }
}
