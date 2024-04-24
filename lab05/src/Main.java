import Library.Library;

import java.util.Scanner;

public class Main {
    public static Library library = new Library();
    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        int option;
        boolean keepInSystem = true;
        do {
            System.out.println("Welcome to the main system.");
            System.out.println("1. Rooms");
            System.out.println("2. Books");
            System.out.println("3. Log out");
            System.out.print(" > ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    // Rooms menu
                    roomsMenu();
                    break;
                case 2:
                    // Books menu
                    booksMenu();
                    break;
                case 3:
                    keepInSystem = false;
                    System.out.println("Logging out the system. Goodbye...");
                    break;
                default:
                    System.out.println("You entered an invalid option. Please try again.");
                    break;
            }
        } while(keepInSystem);
    }
    public static void roomsMenu(){
        Scanner sc = new Scanner(System.in);
        int option;
        boolean keepInSystem = true;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Show available rooms");
            System.out.println("2. Show reserved rooms");
            System.out.println("3. Show information about a specific room");
            System.out.println("4. Reserve a room");
            System.out.println("5. Cancel a room reservation");
            System.out.println("6. Leave menu");
            System.out.print(" > ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    library.printAvailableRooms();
                    break;
                case 2:
                    library.printReservedRooms();
                    break;
                case 3:
                    System.out.println("Please specify the book ISBN: ");
                    library.obtainBook(sc.nextLine());
                    break;
                case 4:

                    break;
                case 5:
                    // Cancel a room reservation
                    break;
                case 6:
                    keepInSystem = false;
                    break;
                default:
                    System.out.println("You entered an invalid option. Please try again.");
                    break;
            }
        } while(keepInSystem);
    }
    public static void booksMenu(){
        Scanner sc = new Scanner(System.in);
        int option;
        boolean keepInSystem = true;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Show available books");
            System.out.println("2. Show borrowed books");
            System.out.println("3. Show information about a specific book");
            System.out.println("4. Lend a book");
            System.out.println("5. Return book");
            System.out.println("6. Leave menu");
            System.out.print(" > ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    // Show available books
                    library.printAvailableBooks();
                    break;
                case 2:
                    // Show borrowed books
                    library.printBorrowedBooks();
                    break;
                case 3:
                    // Show information about a specific book
                    break;
                case 4:
                    // Lend book
                    break;
                case 5:
                    // Return book
                    break;
                case 6:
                    keepInSystem = false;
                    break;
                default:
                    System.out.println("You entered an invalid option. Please try again.");
                    break;
            }
        } while(keepInSystem);
    }
}
