package menusfactory.menus;

public class RoomsMenu implements Menu{
    @Override
    public void show() {
        System.out.println("¿Qué tipo de habitación?");
        System.out.println("1. Single room");
        System.out.println("2. Double room");
        System.out.println("3. Suite room");
        System.out.println("4. Presidential room");
        System.out.println("5. Salir");
    }
}
