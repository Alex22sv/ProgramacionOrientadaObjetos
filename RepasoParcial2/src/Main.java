public class Main {
    public static void main(String[] args) {
        Configuration.initialize();
        Configuration configuration = Configuration.getInstance();
        System.out.println(configuration.getURL());
    }
}
