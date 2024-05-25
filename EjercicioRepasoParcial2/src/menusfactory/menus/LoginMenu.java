package menusfactory.menus;

public class LoginMenu implements Menu{
    @Override
    public void show() {
        System.out.println("Bienvenido al Hotel Skyloft");
        System.out.println("===========================");
        System.out.println("1. Login");
        System.out.println("2. Salir del sistema");
    }
}
