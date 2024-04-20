public class PSU {
    private String model;
    private String brand;
    private float voltage;
    private float current;
    private String certification;
    // Constructores
    public PSU(String model, String brand, float voltage, float current, String certification){
        this.model = model;
        this.brand = brand;
        this.voltage = voltage;
        this.current = current;
        this.certification = certification;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getCurrent() {
        return current;
    }

    public void setCurrent(float current) {
        this.current = current;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}
