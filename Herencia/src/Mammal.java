public class Mammal extends Animal {
    // Internamente apunta a mammal
    private int tiempoGestacion;
    private String tipoPelaje;
    private int tasaNatalidad;
    public Mammal(String nombre, String nombreCientifico, String habitat, String tipoDieta, int longevidad, int tiempoGestacion, String tipoPelaje, int tasaNatalidad){
        // Llama al constructor del padre
        super(nombre, nombreCientifico, habitat, tipoDieta, longevidad);
        this.tiempoGestacion = tiempoGestacion;
        this.tipoPelaje = tipoPelaje;
        this.tasaNatalidad = tasaNatalidad;
    }
    public int getTiempoGestacion(){
        return tiempoGestacion;
    }
    public String getTipoPelaje(){
        return tipoPelaje;
    }
    public int getTasaNatalidad(){
        return tasaNatalidad;
    }
    public void setTiempoGestacion(int tiempoGestacion){
        this.tiempoGestacion = tiempoGestacion;
    }
    public void setTipoPelaje(String tipoPelaje){
        this.tipoPelaje = tipoPelaje;
    }
    public void setTasaNatalidad(int tasaNatalidad){
        this.tasaNatalidad = tasaNatalidad;
    }
    // Dejar explícito que el hijo tiene un método que sobreescribe la del padre
    @Override
    public void atacar(){
        System.out.println("I'm bitting!!!");
    }
}
