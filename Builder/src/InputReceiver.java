import java.util.Scanner;

public class InputReceiver {
    public static int getData(String[] ops){
        System.out.println("Choose an option: ");
        for(int i = 0; i < ops.length; i++){
            System.out.println((i+1)+": "+ops[i]);
        }
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt()-1;
    }
}
