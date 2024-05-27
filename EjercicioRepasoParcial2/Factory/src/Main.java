import factory.ApplicationFactory;
import factory.BankingAppFactory;
import factory.GameAppFactory;
import factory.ShoppingAppFactory;
import factory.apps.Application;

public class Main {
    public static void main(String[] args) {
        Application app;
        ApplicationFactory applicationFactory;
        System.out.println("¿Cuál app desea crear? ?");
        System.out.println("1. Game");
        System.out.println("2. Banking");
        System.out.println("3. Shopping");
        int flag = 1;
        switch(flag){
            case 1:
                applicationFactory = new GameAppFactory();
                app = applicationFactory.createApplication();
                app.setName("Game 1");
                app.setVersion("V1");
                System.out.println(app.getName());
                break;
            case 2:
                applicationFactory = new BankingAppFactory();
                app = applicationFactory.createApplication();
                app.setName("Game 2");
                app.setVersion("V2");
                System.out.println(app.getName());
                break;
            case 3:
                applicationFactory = new ShoppingAppFactory();
                app = applicationFactory.createApplication();
                app.setName("Game 3");
                app.setVersion("V3");
                System.out.println(app.getName());
                break;
        }
    }
}
