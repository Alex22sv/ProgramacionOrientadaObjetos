package org.alexsv.repasoparcial;

import java.util.Date;

public class Tarea {
    private int tareasId;
    private String tareasTarea;
    private String tareasCategoria;
    private Date tareasFecha;

    public Tarea(int tareasId, String tareasTarea, String tareasCategoria, Date tareasFecha) {
        this.tareasId = tareasId;
        this.tareasTarea = tareasTarea;
        this.tareasCategoria = tareasCategoria;
        this.tareasFecha = tareasFecha;
    }

    public int getTareasId() {
        return tareasId;
    }

    public void setTareasId(int tareasId) {
        this.tareasId = tareasId;
    }

    public String getTareasTarea() {
        return tareasTarea;
    }

    public void setTareasTarea(String tareasTarea) {
        this.tareasTarea = tareasTarea;
    }

    public String getTareasCategoria() {
        return tareasCategoria;
    }

    public void setTareasCategoria(String tareasCategoria) {
        this.tareasCategoria = tareasCategoria;
    }

    public Date getTareasFecha() {
        return tareasFecha;
    }

    public void setTareasFecha(Date tareasFecha) {
        this.tareasFecha = tareasFecha;
    }
}
