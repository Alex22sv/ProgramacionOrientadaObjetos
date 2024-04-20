package forma;

public class Cuadrado extends Forma {
    private float lado;
    public Cuadrado(){
        this.lado = 0.0f;
    }
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    @Override
    public float calcularArea() {
        return (lado*lado);
    }
    @Override
    public float calcularPerimetro() {
        return (4*lado);
    }
}
