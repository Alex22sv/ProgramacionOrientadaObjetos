package menusfactory.menus;

public class ClienteMenu implements Menu{
    @Override
    public void show() {
        System.out.println("Opciones de cliente:");
        System.out.println("====================");
        System.out.println("1. Ver habitaciones");
        System.out.println("2. Reservar habitación");
        System.out.println("3. Solicitar actualizaciones");
        System.out.println("4. Cancelar actualizaciones");
        System.out.println("5. Hacer check-in");
        System.out.println("6. Hacer check-out");
        System.out.println("7. Ver reservas");
        System.out.println("8. Eliminar reserva");
        System.out.println("9. Salir");
    }
}
