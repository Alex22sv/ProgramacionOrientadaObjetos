import java.util.ArrayList;

public class PCBuilder {
    /* void buildPC(){
        No vamos a hacer un método de buildPC porque es lo único que quiero que haga en esta clase, por lo que lo podemos hacer directamente en el main.
    } */
    public static void main(String[] args) {
        CPU procesador = new CPU();
        /*
        // Instancio la clase CPU en un objeto
        procesador.setBrand("AMD");
        procesador.setModel("Ryzen 7");
        procesador.setSpeed(7);
        procesador.setCores(4);
        procesador.setThreads(16);
        */
        /*
        RAM memoria = new RAM();
        memoria.setBrand("Kingston");
        memoria.setModel("KIngston 7");
        memoria.setCapacity(1024);
        memoria.setFrecuency(256);
        memoria.setRgb(true);
        */
        CPU procesdor2 = new CPU("AMDx", "Ryzen 7", 7, 4, 16);
        RAM memoria2 = new RAM("Kinstong", "Kingston 7", 1024, 256, true);
        PSU fuente = new PSU("Niidea", "Thunderbolt", 10.45F, 20.1F, "WTF");
        Storage disco = new Storage("Kingston", "Generyc", 300.64, 20,14, "SSD");
        Motherboard mother = new Motherboard("Streamex", "3.2.0.1");
        mother.setCpu(procesdor2);
        mother.setRam(memoria2);
        mother.setPsu(fuente);

        ArrayList<Storage> discos = new ArrayList<>();
        discos.add(disco);
        mother.setStorage(discos);
        
        OS sistema = new OS("Windows", "Microsoft", "1.0.2.1h");
        // Establecer el sistema del almacenamiento que está dentro de un ArrayList de almacenamientos dentro de la motherboard
        mother.getStorage().get(0).setSystem(sistema);

        System.out.println("Booting...");

    }
}
