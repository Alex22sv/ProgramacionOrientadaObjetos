package items;
//import items.Item;

public class Healing extends Item {
    private int numberUses;
    private int restoreAmount;
    public Healing(int ID, String name, int numberUses, int restoreAmount){
        super(ID, name);
        this.numberUses = numberUses;
        this.restoreAmount = restoreAmount;
    }
    public int getNumberUses() {
        return numberUses;
    }
    public void setNumberUses(int numberUses) {
        this.numberUses = numberUses;
    }
    public int getRestoreAmount() {
        return restoreAmount;
    }
    public void setRestoreAmount(int restoreAmount) {
        this.restoreAmount = restoreAmount;
    }
    public void restoreHealth(){
        if(numberUses != 0) {
            System.out.println("*Pokemon Center Sounds*");
            numberUses--;
        }else{
            System.out.println("<No stock available>");
        }
    }

}
 14 changes: 14 additions & 0 deletions14  
Game/src/items/Item.java
@@ -0,0 +1,14 @@
package items;

public class Item {
    private int ID;
    private String name;
    public Item(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public int getID(){ return ID; }
    public void setID(int ID) { this.ID = ID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}