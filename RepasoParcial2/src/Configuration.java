public class Configuration {
    private static Configuration instance;
    private String URL;
    private double waitingTime;

    private Configuration(String URL, double waitingTime) {
        this.URL = URL;
        this.waitingTime = waitingTime;
    }
    public static void initialize() {
        if(instance == null) {
            instance = new Configuration("www.uca.edu.sv", 120.00);
        } else {
            System.out.println("The configuration has already been initialized.");
        }
    }
    public static Configuration getInstance() {
        return instance;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public double getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }
}
