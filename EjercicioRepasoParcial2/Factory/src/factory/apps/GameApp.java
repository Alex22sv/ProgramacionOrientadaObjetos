package factory.apps;

public class GameApp extends Application {
    public GameApp(){
        super();
    }
    public GameApp(String name, String version) {
        super(name, version);
    }

    @Override
    public void run(){
        System.out.println("Iniciando sistema de juego.");
    }
}
