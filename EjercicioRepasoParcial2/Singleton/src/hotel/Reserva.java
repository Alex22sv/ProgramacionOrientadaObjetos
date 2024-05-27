package hotel;

import reservation.*;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaRegistro;
    private LocalDate fechaIngreso;
    private int enstanciaDias;
    private int ocupantes;
    private String roomID;

    public Reserva(LocalDate fechaRegistro, LocalDate fechaIngreso, int enstanciaDias, int ocupantes, String roomID) {
        this.fechaRegistro = fechaRegistro;
        this.fechaIngreso = fechaIngreso;
        this.enstanciaDias = enstanciaDias;
        this.ocupantes = ocupantes;
        this.roomID = roomID;
    }

    public void nuevaReserva(){
        Handler handler1 = new IncomeHandler();
        Handler handler2 = new CreditStatusHandler();
        Handler handler3 = new AdvanceTimeHandler();
        Handler handler4 = new CapacityHandler();
    }

    public LocalDate getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}
    public LocalDate getFechaIngreso() {return fechaIngreso;}
    public void setFechaIngreso(LocalDate fechaIngreso) {this.fechaIngreso = fechaIngreso;}
    public int getEnstanciaDias() {return enstanciaDias;}
    public void setEnstanciaDias(int enstanciaDias) {this.enstanciaDias = enstanciaDias;}
    public int getOcupantes() {return ocupantes;}
    public void setOcupantes(int ocupantes) {this.ocupantes = ocupantes;}
    public String getRoomID() {return roomID;}
    public void setRoomID(String roomID) {this.roomID = roomID;}
}
