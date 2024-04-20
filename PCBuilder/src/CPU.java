public class CPU {
    private String model;
    private String brand;
    private float speed;
    private int threads;
    private int cores;

    // ----------------------
    // Cnstructors
    public CPU(){
        // Este sirve cuando queremos dejar valores por defecto
        brand = "Patito";
        model = "Duck 7000";
        speed = 2056;
        threads = 512;
        cores = 118;
    }
    public CPU(String brand, String model, int speed, int threads, int cores){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.threads = threads;
        this.cores = cores;

    }

    // Getters & setters
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public float getSpeed() {
        return speed;
    }

    public int getThreads() {
        return threads;
    }

    public int getCores() {
        return cores;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
