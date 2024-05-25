import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentFactory factory = null;
        Student student = null;
        boolean flag = true;
        while(flag){
            System.out.println("Hello, what do you want to study?");
            System.out.println("1. Undergraduate program");
            System.out.println("2. Master program");
            System.out.println("3. PhD program");
            System.out.println("4. Leave system");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    factory = new UndergraduateStudentFactory();
                    break;
                case 2:
                    factory = new MasterStudentFactory();
                    break;
                case 3:
                    factory = new PhDStudentFactory();
                    break;
                default:
                    flag = false;
                    break;
            }
            if(flag){
                student = factory.createStudent();
                student.enroll();
                student.attendCourse();
                student.graduate();
            }
        }
    }
}
