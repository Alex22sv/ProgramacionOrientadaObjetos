import animal.*;
import forma.Cuadrado;
import forma.Triangulo;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.sonido();
        Perro perro = new Perro();
        perro.sonido();
        Triangulo triangulo = new Triangulo(4.5f, 12.5f, 4.5f, 9.8f);
        Cuadrado cuadrado = new Cuadrado(3.0f);
        System.out.println("Área del triángulo: "+triangulo.calcularArea()+"\nPerímetro del triángulo: "+triangulo.calcularPerimetro());
        System.out.println("Área del cuadrado: "+cuadrado.calcularArea()+"\nPerímetro del cuadrado: "+cuadrado.calcularPerimetro());
    }
}
