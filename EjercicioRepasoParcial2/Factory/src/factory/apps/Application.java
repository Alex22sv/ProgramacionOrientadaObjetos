package factory.apps;

public abstract class Application {
    private String name;
    private String version;
    public Application(){
        this.name = "";
        this.version = "";
    }
    public Application(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public void run(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
