package org.alexsv.repasoparcial;

import java.util.Date;

public class Empleado {
    private int empleadosId;
    private String empleadosNombre;
    private String empleadosApellido;
    private int empleadosCantidad;

    public Empleado(int empleadosId, String empleadosNombre, String empleadosApellido, int empleadosCantidad) {
        this.empleadosId = empleadosId;
        this.empleadosNombre = empleadosNombre;
        this.empleadosApellido = empleadosApellido;
        this.empleadosCantidad = empleadosCantidad;
    }

    public int getEmpleadosId() {
        return empleadosId;
    }

    public void setEmpleadosId(int empleadosId) {
        this.empleadosId = empleadosId;
    }

    public String getEmpleadosNombre() {
        return empleadosNombre;
    }

    public void setEmpleadosNombre(String empleadosNombre) {
        this.empleadosNombre = empleadosNombre;
    }

    public String getEmpleadosApellido() {
        return empleadosApellido;
    }

    public void setEmpleadosApellido(String empleadosApellido) {
        this.empleadosApellido = empleadosApellido;
    }

    public int getEmpleadosCantidad() {
        return empleadosCantidad;
    }

    public void setEmpleadosCantidad(int empleadosCantidad) {
        this.empleadosCantidad = empleadosCantidad;
    }
}
