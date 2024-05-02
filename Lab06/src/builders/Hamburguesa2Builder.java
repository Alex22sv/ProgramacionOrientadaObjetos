package builders;

import comida.Hamburguesa;

public class Hamburguesa2Builder implements Builder {
    private Hamburguesa hamburguesa2 = new Hamburguesa();
    @Override
    public void buildTipoCarne() {
        this.hamburguesa2.setTipoCarne("carne");
    }

    @Override
    public void buildLechuga() {
        this.hamburguesa2.setLechuga(false);
    }

    @Override
    public void buildTomate() {
        this.hamburguesa2.setTomate(true);
    }

    @Override
    public void buildCebolla() {
        this.hamburguesa2.setCebolla(false);
    }

    @Override
    public void buildQueso() {
        this.hamburguesa2.setQueso(false);
    }

    @Override
    public Hamburguesa build() {
        return hamburguesa2;
    }
}
