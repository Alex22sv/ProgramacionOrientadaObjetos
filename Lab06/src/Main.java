import cocina.Cocina;
import comida.Hamburguesa;
import builders.*;


public class Main {
    public static void main(String[] args) {
        // Cambio
        Builder builder1 = new Hamburguesa1Builder();
        Builder builder2 = new Hamburguesa2Builder();
        Builder builder3 = new Hamburguesa3Builder();
        Cocina cocina = Cocina.getInstancia();
        cocina.cocinar();
        Hamburguesa hamburguesa1 = cocina.BuildHamburguesa(builder1);
        Hamburguesa hamburguesa2 = cocina.BuildHamburguesa(builder2);
        Hamburguesa hamburguesa3 = cocina.BuildHamburguesa(builder3);
        hamburguesa1.mostrarInfo();
        hamburguesa2.mostrarInfo();
        hamburguesa3.mostrarInfo();
    }
}
