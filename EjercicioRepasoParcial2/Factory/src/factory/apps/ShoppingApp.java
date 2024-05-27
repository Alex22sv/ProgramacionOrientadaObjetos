package factory.apps;

public class ShoppingApp extends Application {
    public ShoppingApp(){
        super();
    }
    public ShoppingApp(String name, String version) {
        super(name, version);
    }

    @Override
    public void run(){
        System.out.println("Iniciando sistema de compras.");
    }
}
