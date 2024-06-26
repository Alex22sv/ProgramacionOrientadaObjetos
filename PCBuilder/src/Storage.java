public class Storage {
    private String brand;
    private String model;
    private double capacity;
    private int readSpeed;
    private int writeSpeed;
    private String type;
    private OS system;
    // Storage
    public Storage(String brand, String model, double capacity, int readSpeed, int writeSpeed, String type){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.type = type;
    }
    public Storage(String brand, String model, double capacity, int readSpeed, int writeSpeed, String type, OS system){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.type = type;
        this.system = system;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OS getSystem() {
        return system;
    }

    public void setSystem(OS system) {
        this.system = system;
    }
}
