package items;
//import items.Item;

public class Weapon extends Item {
    private int bullets;
    private float damage;
    private int durability;
    private String condition;
    public Weapon(int ID, String name, int bullets, float damage, int durability){
        super(ID, name);
        this.bullets = bullets;
        this.damage = damage;
        this.durability = durability;
        this.condition = "perfect";
    }

    public void shoot(){
        System.out.println("BANG!");
        receiveDamage(5);
    }
    private void receiveDamage(int dmg){
        // Es privada ya que por la lógica del programa, sólo el weapon puede recibir daño
        durability -= dmg;
        if(durability<=0){
            condition = "broken";
        }
    }
}