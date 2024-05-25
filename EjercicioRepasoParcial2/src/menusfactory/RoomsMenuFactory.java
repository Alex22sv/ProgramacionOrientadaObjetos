package menusfactory;

import menusfactory.menus.Menu;
import menusfactory.menus.RoomsMenu;

public class RoomsMenuFactory implements MenuFactory{
    @Override
    public Menu createMenu() {
        return new RoomsMenu();
    }
}
