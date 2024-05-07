public class Director {
    private SandwichBuilder builder;
    public Director(SandwichBuilder builder) {
        this.builder = builder;
    }
    public void changeBuilder(SandwichBuilder builder) {
        this.builder = builder;
    }
    public void make(String type){
        switch (type){
            case "hamburguer":
                builder.buildBread();
                builder.buildCheese();
                builder.buildMeat();
                builder.buildSauces();
                builder.buildVeggies();
                break;
            case "hotdog":
                builder.buildBread();
                builder.buildMeat();
                builder.buildSauces();
                builder.buildVeggies();
                break;
        }
    }
}
