public class CPU {
    private String model;
    private String brand;
    private float speed;
    private int threads;
    private int cores;

    public String getModel() {
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public float getSpeed(){
        return speed;
    }
    public int getThreads(){
        return threads;
    }
    public int getCores() {
        return cores;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSpeed(float speed){
        this.speed = speed;
    }
    public void setThreads(int threads){
        this.threads = threads;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
}
