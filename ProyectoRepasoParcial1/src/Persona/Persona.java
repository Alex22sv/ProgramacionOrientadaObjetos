package Persona;

import java.util.Date;

public class Persona {
    private String DUI;
    private String nombre;
    private Date fechaNacimiento;
    private char sexo;
    private String numeroTelefono;
    public Persona(){
        this.DUI = "";
        this.nombre = "";
        this.fechaNacimiento = new Date();
        this.sexo = ' ';
        this.numeroTelefono = "";
    }
    public Persona(String DUI, String nombre, Date fechaNacimiento, char sexo, String numeroTelefono){
        this.DUI = DUI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.numeroTelefono = numeroTelefono;
    }
    public Persona(Persona persona){
        DUI = persona.DUI;
        nombre = persona.nombre;
        fechaNacimiento = persona.fechaNacimiento;
        sexo = persona.sexo;
        numeroTelefono = persona.numeroTelefono;
    }
    protected void copiarPersona(Persona persona){
        this.DUI = persona.DUI;
        this.nombre = persona.nombre;
        this.fechaNacimiento = persona.fechaNacimiento;
        this.sexo = persona.sexo;
        this.numeroTelefono = persona.numeroTelefono;
    }
    public String getDUI(){return DUI;}
    public String getNombre(){return nombre;}
    public Date getFechaNacimiento(){return fechaNacimiento;}
    public char getSexo(){return sexo;}
    public String getNumeroTelefono(){return numeroTelefono;}
    public void setDUI(String DUI){this.DUI = DUI;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaNacimiento(Date fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    public void setSexo(char sexo){this.sexo = sexo;}
    public void setNumeroTelefono(String numeroTelefono){this.numeroTelefono = numeroTelefono;}
}
