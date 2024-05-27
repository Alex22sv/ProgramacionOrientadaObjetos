package factory.apps;

public class BankingApp extends Application {
    public BankingApp() {
        super();
    }
    public BankingApp(String name, String version) {
        super(name, version);
    }

    @Override
    public void run(){
        System.out.println("Iniciando sistema de banco.");
    }
}
