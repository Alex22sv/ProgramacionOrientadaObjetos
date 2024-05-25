package menusfactory;

import menusfactory.menus.AdminMenu;
import menusfactory.menus.Menu;

public class AdminMenuFactory implements MenuFactory {
    @Override
    public Menu createMenu() {
        return new AdminMenu();
    }
}
