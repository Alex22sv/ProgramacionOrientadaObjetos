import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String profesion;
    private int timesRegional;
    private int timesWorldFinal;
    private LocalDate fechaNacimiento;
    private LocalDate fechaInicioEstudios;

    public Persona(String nombre, String profesion, int timesRegional, int timesWorldFinal, LocalDate fechaNacimiento, LocalDate fechaInicioEstudios) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.timesRegional = timesRegional;
        this.timesWorldFinal = timesWorldFinal;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInicioEstudios = fechaInicioEstudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTimesRegional() {
        return timesRegional;
    }

    public void setTimesRegional(int timesRegional) {
        this.timesRegional = timesRegional;
    }

    public int getTimesWorldFinal() {
        return timesWorldFinal;
    }

    public void setTimesWorldFinal(int timesWorldFinal) {
        this.timesWorldFinal = timesWorldFinal;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaInicioEstudios() {
        return fechaInicioEstudios;
    }

    public void setFechaInicioEstudios(LocalDate fechaInicioEstudios) {
        this.fechaInicioEstudios = fechaInicioEstudios;
    }
}
