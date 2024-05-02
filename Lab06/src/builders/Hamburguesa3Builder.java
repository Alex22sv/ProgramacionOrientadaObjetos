package builders;

import comida.Hamburguesa;

public class Hamburguesa3Builder implements Builder {
    private Hamburguesa hamburguesa3 = new Hamburguesa();
    @Override
    public void buildTipoCarne() {
        this.hamburguesa3.setTipoCarne("tocino");
    }

    @Override
    public void buildLechuga() {
        this.hamburguesa3.setLechuga(true);
    }

    @Override
    public void buildTomate() {
        this.hamburguesa3.setTomate(true);
    }

    @Override
    public void buildCebolla() {
        this.hamburguesa3.setCebolla(false);
    }

    @Override
    public void buildQueso() {
        this.hamburguesa3.setQueso(false);
    }

    @Override
    public Hamburguesa build() {
        return hamburguesa3;
    }
}
