public class OS {
    private String model;
    private String brand;
    private String version;
    public OS(String model, String brand, String version){
        this.model = model;
        this.brand = brand;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

