package animal;

public abstract class Animal {
    private String name;
    private int age;
    private String habitat;
    public abstract void sonido();
    public void sleep(){
        System.out.println("ZZZ...");
    }
    public void eat(){
        System.out.println("Yum yum...");
    }
}
