public class HamburguerBuilder implements SandwichBuilder{
    private Hamburguer hamburguer;
    public HamburguerBuilder(){
        hamburguer =  new Hamburguer();
    }
    @Override
    public void reset() {
        hamburguer = new Hamburguer();
    }

    @Override
    public void buildBread() {
        String[] options = new String[]{"normal", "kaiser", "integral"};
        int opt = InputReceiver.getData(options);
        hamburguer.setBread(options[opt]);
    }

    @Override
    public void buildVeggies() {
        String[] options = new String[]{"todo", "lechuga", "tomate", "cebolla"};
        int opt = InputReceiver.getData(options);
        hamburguer.setVeggies(options[opt]);
    }

    @Override
    public void buildMeat() {
        String[] options = new String[]{"res", "pollo empanizado", "pollo a la plancha"};
        int opt = InputReceiver.getData(options);
        hamburguer.setMeat(options[opt]);
    }

    @Override
    public void buildSauces() {
        String[] options = new String[]{"todo", "keptchup", "mostaza"};
        int opt = InputReceiver.getData(options);
        hamburguer.setSauces(options[opt]);
    }

    @Override
    public void buildCheese() {
        String[] options = new String[]{"todo", "cheedar", "mozarella"};
        int opt = InputReceiver.getData(options);
        hamburguer.setCheese(options[opt]);
    }
    public Hamburguer getHamburguer() {return hamburguer;}
}
