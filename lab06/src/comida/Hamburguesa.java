package comida;

public class Hamburguesa {
    private String tipoCarne;
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;

    public void setTipoCarne(String tipoCarne) {this.tipoCarne = tipoCarne;}
    public void setLechuga(boolean lechuga) {this.lechuga = lechuga;}
    public void setTomate(boolean tomate) {this.tomate = tomate;}
    public void setCebolla(boolean cebolla) {this.cebolla = cebolla;}
    public void setQueso(boolean queso) {this.queso = queso;}

    public void mostrarInfo(){
        System.out.println("Tipo carne: " + tipoCarne);
        System.out.println("Lechuga: " + lechuga);
        System.out.println("Tomate: " + tomate);
        System.out.println("Cebolla: " + cebolla);
        System.out.println("Queso: " + queso);
        System.out.println("---------------------------------------");
    }
}
