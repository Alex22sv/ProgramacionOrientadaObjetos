public class Main {
    public static void main(String[] args) {
        Hamburguer hamburguer;
        HotDog hotDog;
        HamburguerBuilder hamburguerBuilder = new HamburguerBuilder();
        HotDogBuilder hotDogBuilder = new HotDogBuilder();
        Director director = new Director(hamburguerBuilder);

        director.make("hamburguer");
        hamburguer = hamburguerBuilder.getHamburguer();

        director.changeBuilder(hotDogBuilder);
        director.make("hotdog");
        hotDog = hotDogBuilder.getHotDog();

        System.out.println(hamburguer.toString());
        System.out.println(hotDog.toString());
    }
}
