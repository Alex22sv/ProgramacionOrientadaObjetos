package Empleado;

import Persona.Persona;

public class EmpleadoTiempoParcial extends Empleado implements PagoPorHoras {
    private int horasBase;
    public EmpleadoTiempoParcial(Persona persona, String carnet, float salarioBase, int horasBase){
        inicializarEmpleado(persona, carnet, salarioBase);
        this.horasBase = horasBase;
    }
    public int getHorasBase() {return horasBase;}
    public void setHorasBase(int horasBase) {this.horasBase = horasBase;}
    @Override
    public float obtenerSalario() {
        return calcularSalario(horasBase);
    }
    @Override
    public float calcularSalario(int cantidadHorasTrabajadas) {
        return cantidadHorasTrabajadas*getSalarioBase();
    }
}
