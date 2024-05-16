package builders;

import comida.Hamburguesa;

public interface Builder {
    public void buildTipoCarne();
    public void buildLechuga();
    public void buildTomate();
    public void buildCebolla();
    public void buildQueso();
    Hamburguesa build();
}
