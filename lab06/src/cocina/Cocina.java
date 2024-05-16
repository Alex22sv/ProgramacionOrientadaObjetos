package cocina;

import comida.Hamburguesa;
import builders.Builder;

public class Cocina {
    private static Cocina instancia;
    private Builder builder;
    private Cocina(){
    }
    public static Cocina getInstancia(){
        if(instancia == null){
            instancia = new Cocina();
        }
        return instancia;
    }
    public void cocinar(){
        System.out.println("Estoy cocinando...");
    }
    public Hamburguesa BuildHamburguesa(Builder builder){
        builder.buildTipoCarne();
        builder.buildLechuga();
        builder.buildTomate();
        builder.buildQueso();
        builder.buildCebolla();
        return builder.build();
    }
}
