package menusfactory.menus;

public class AdminMenu implements Menu{
    @Override
    public void show() {
        System.out.println("Opciones de administrador:");
        System.out.println("==========================");
        System.out.println("1. Añadir habitación");
        System.out.println("2. Ver habitaciones");
        System.out.println("3. Mover habitación");
        System.out.println("4. Eliminar habitación");
        System.out.println("5. Salir");
    }
}
