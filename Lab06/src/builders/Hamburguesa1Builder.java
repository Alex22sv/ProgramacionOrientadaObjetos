package builders;

import comida.Hamburguesa;

public class Hamburguesa1Builder implements Builder {
    private Hamburguesa hamburguesa1 = new Hamburguesa();
    @Override
    public void buildTipoCarne() {
        this.hamburguesa1.setTipoCarne("pollo");
    }

    @Override
    public void buildLechuga() {
        this.hamburguesa1.setLechuga(true);
    }

    @Override
    public void buildTomate() {
        this.hamburguesa1.setTomate(true);
    }

    @Override
    public void buildCebolla() {
        this.hamburguesa1.setCebolla(false);
    }

    @Override
    public void buildQueso() {
        this.hamburguesa1.setQueso(false);
    }

    @Override
    public Hamburguesa build() {
        return hamburguesa1;
    }
}
