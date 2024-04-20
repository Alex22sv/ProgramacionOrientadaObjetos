public class RAM {
    private String model;
    private String brand;
    private int capacity;
    private int frecuency;
    private boolean rgb;
    // Constructor
    public RAM(String model, String brand, int capacity, int frecuency, boolean rgb){
        this.model = model;
        this.brand = brand;
        this.capacity = capacity;
        this.frecuency = frecuency;
        this.rgb = rgb;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFrecuency() {
        return frecuency;
    }

    public boolean getRgb() {
        return rgb;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
}
