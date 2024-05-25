package menusfactory;

import menusfactory.menus.ClienteMenu;
import menusfactory.menus.Menu;

public class ClienteMenuFactory implements MenuFactory{
    @Override
    public Menu createMenu() {
        return new ClienteMenu();
    }
}
