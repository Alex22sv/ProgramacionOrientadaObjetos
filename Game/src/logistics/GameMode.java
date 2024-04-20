package logistics;
public class GameMode {
    private int ID;
    private String name;
    private String characteristics;

    public GameMode(int ID, String name, String characteristics) {
        this.ID = ID;
        this.name = name;
        this.characteristics = characteristics;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}