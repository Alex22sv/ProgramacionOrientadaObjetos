import decorators.EmailDecorator;
import decorators.InterfaceNotifier;
import decorators.Notifier;
import decorators.WhatsAppDecorator;
import iterators.IterableCollection;
import iterators.ResidentCollection;
import iterators.ResidentIterator;
import residents.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static IterableCollection residents = new ResidentCollection(loadResidents());
    public static ResidentIterator residentIterator;
    public static void main(String[] args) {
        mostrarResidentesSolventes();
        mostrarResidentesDeudores();
    }
    public static List<Resident> loadResidents() {
        List<Resident> residentsList = new ArrayList<>(10);

        // Creando los primeros cinco residentes con saldo deudor 0
        residentsList.add(new Resident("Juan", "Gonzalez", 101, 0, "555-1234", "juan@example.com"));
        residentsList.add(new Resident("Maria", "Lopez", 102, 0, "555-5678", "maria@example.com"));
        residentsList.add(new Resident("Carlos", "Martinez", 103, 0, "555-9012", "carlos@example.com"));
        residentsList.add(new Resident("Ana", "Rodriguez", 104, 0, "555-3456", "ana@example.com"));
        residentsList.add(new Resident("Pedro", "Sanchez", 105, 0, "555-7890", "pedro@example.com"));

        // Creando los últimos cinco residentes con saldo deudor diferente de 0
        residentsList.add(new Resident("Luis", "Perez", 201, 50.0, "555-1111", "luis@example.com"));
        residentsList.add(new Resident("Laura", "Gomez", 202, 75.0, "555-2222", "laura@example.com"));
        residentsList.add(new Resident("Javier", "Diaz", 203, 100.0, "555-3333", "javier@example.com"));
        residentsList.add(new Resident("Sofia", "Hernandez", 204, 125.0, "555-4444", "sofia@example.com"));
        residentsList.add(new Resident("Miguel", "Torres", 205, 150.0, "555-5555", "miguel@example.com"));

        return residentsList;
    }
    public static void mostrarResidentesSolventes(){
        residentIterator = residents.createSolventIterator();
        System.out.println("---------------------");
        System.out.println("Clientes solventes: ");
        while (residentIterator.hasNextResident()){
            Resident resident = residentIterator.getNextResident();
            System.out.println("Nombre: "+resident.getNames()+" "+resident.getLastNames());
        }
    }
    public static void mostrarResidentesDeudores(){
        Scanner scanner = new Scanner(System.in);
        residentIterator = residents.createDebtIterator();
        System.out.println("---------------------");
        System.out.println("Clientes con deuda: ");
        while (residentIterator.hasNextResident()){
            System.out.println("--------------------");
            Resident resident = residentIterator.getNextResident();
            System.out.println(residentIterator.getCurrentPosition()+" - "+resident.getNames()+" "+resident.getLastNames());
            System.out.println("Deuda: $"+resident.getDebtBalance());
            InterfaceNotifier notifier = new WhatsAppDecorator(new EmailDecorator(new Notifier()));
            notifier.sendNotification(resident, "Por favor, paga el alquiler");
        }
        System.out.println("-------------- Desafío extra: ");
        System.out.println("¿A quién deseas enviarle el mensaje específico? ");
        int residentOption = scanner.nextInt()-1;
        Resident customResident = residentIterator.getResidentByPosition(residentOption);
        scanner.nextLine();
        System.out.println("1. SMS");
        System.out.println("2. WhatsApp");
        System.out.println("3. Email");
        System.out.println("¿Qué método de mensaje deseas ocupar? ");
        int messageOption = scanner.nextInt();
        InterfaceNotifier customNotifier;

        switch(messageOption){
            case 1:
                customNotifier = new Notifier();
                customNotifier.sendNotification(customResident, "Por favor, paga el alquiler");
                break;
            case 2:
                customNotifier = new WhatsAppDecorator(new Notifier());
                customNotifier.sendNotification(customResident, "Por favor, paga el alquiler");
                break;
            case 3:
                customNotifier = new EmailDecorator(new Notifier());
                customNotifier.sendNotification(customResident, "Por favor, paga el alquiler");
                break;
        }
        // Recomendación del instructor
/*        InterfaceNotifier r = new Notifier();

        System.out.println("Quiere enviarlo tambien por wha");
        if()
            r = new WhatsAppDecorator(r);


        System.out.println("Quiere enviarlo tambien por email");
        if()
            r = new EmailDecorator(r);

        r.sendNotification();*/
    }
}