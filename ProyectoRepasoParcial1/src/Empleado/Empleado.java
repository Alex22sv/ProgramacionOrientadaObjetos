package Empleado;

import Persona.Persona;

abstract class Empleado extends Persona {
    private String carnet;
    private float salarioBase;
    protected void inicializarEmpleado(Persona persona, String carnet, float salarioBase){
        super(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);
    }

    // Una clase abstracta puede tener constructor, pero no servirá para nada.
    public String getCarnet(){return carnet;}
    public float getSalarioBase(){return salarioBase;}
    public void setCarnet(String carnet){this.carnet = carnet;}
    public void setSalarioBase(float salarioBase){this.salarioBase=salarioBase;}
    public abstract float obtenerSalario();
}
