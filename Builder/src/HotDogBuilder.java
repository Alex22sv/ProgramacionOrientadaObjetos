public class HotDogBuilder implements SandwichBuilder{
    private HotDog hotDog;
    public HotDogBuilder(){
        hotDog = new HotDog();
    }
    @Override
    public void reset() {

    }

    @Override
    public void buildBread() {
        String[] options = new String[]{"normal", "kaiser", "integral"};
        int opt = InputReceiver.getData(options);
        hotDog.setBread(options[opt]);
    }

    @Override
    public void buildVeggies() {
        String[] options = new String[]{"todo", "lechuga", "tomate", "cebolla"};
        int opt = InputReceiver.getData(options);
        hotDog.setVeggies(options[opt]);
    }

    @Override
    public void buildMeat() {
        hotDog.setMeat("salchicha");
    }

    @Override
    public void buildSauces() {
        String[] options = new String[]{"todo", "keptchup", "mostaza"};
        int opt = InputReceiver.getData(options);
        hotDog.setSauces(options[opt]);
    }

    @Override
    public void buildCheese() {
        System.out.println("ESta opción no se usa acá, pero debe ser implementada porque es parte de la interface.");
    }
    public HotDog getHotDog() {
        return hotDog;
    }
}
