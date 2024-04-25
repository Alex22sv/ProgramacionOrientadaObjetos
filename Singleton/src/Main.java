public class Main {
    public static void main(String[] args) {
        // Eager Singletone
        // Siempre se hace, aunque no lo hayan pedido ni se use
        Gobierno2.initializeInstance();
        Gobierno1 gobierno1 = Gobierno1.getInstancia();
        System.out.println(gobierno1.getLider() + " - " + gobierno1.getPais());
        Gobierno2 gobierno2 = Gobierno2.getInstancia();
        System.out.println(gobierno2.getLider() + " - " + gobierno2.getPais());

    }
}
