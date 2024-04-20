package forma;

public class Triangulo extends Forma {
    private float base;
    private float ladoA, ladoB;
    private float altura;
    public Triangulo(){
        this.base = 0.0f;
        this.ladoA = 0.0f;
        this.ladoB = 0.0f;
        this.altura = 0.0f;
    }
    public Triangulo(float base, float ladoA, float ladoB, float altura){
        this.base = base;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }
    @Override
    public float calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public float calcularPerimetro() {
        return (base+ladoA+ladoB);
    }

    public float getBase() {return base;}
    public void setBase(float base) {this.base = base;}
    public float getLadoA() {return ladoA;}
    public void setLadoA(float ladoA) {this.ladoA = ladoA;}
    public float getLadoB() {return ladoB;}
    public void setLadoB(float ladoB) {this.ladoB = ladoB;}
    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}
}
