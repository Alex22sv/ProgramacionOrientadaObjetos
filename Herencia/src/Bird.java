public class Bird extends Animal{
    private boolean vuela;
    private String tipoPico;
    private String tipoPlumaje;
    public Bird(String nombre, String nombreCientifico, String habitat, String tipoDieta, int longevidad, boolean vuela, String tipoPico, String tipoPlumaje) {
        super(nombre, nombreCientifico, habitat, tipoDieta, longevidad);
        this.vuela = vuela;
        this.tipoPico = tipoPico;
        this.tipoPlumaje = tipoPlumaje;
    }
    public boolean isVuela(){
        return vuela;
    }
    public String getTipoPico(){
        return tipoPico;
        }
    public String getTipoPlumaje(){
        return tipoPlumaje;
    }
    public void setVuela(boolean vuela){
        this.vuela = vuela;
    }
    public void setTipoPico(String tipoPico){
        this.tipoPico = tipoPico;
    }
    public void setTipoPlumaje(String tipoPlumaje){
        this.tipoPlumaje = tipoPlumaje;
    }
    public void volar(){
        System.out.println("I believe I can fly!");
    }
    @Override
    public void atacar(){
        System.out.println("I'm pecking!!!");
    }
}
