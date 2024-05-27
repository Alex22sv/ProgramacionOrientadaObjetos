package menusfactory;

import menusfactory.menus.Menu;
import menusfactory.menus.LoginMenu;

public class LoginMenuFactory implements MenuFactory{
    @Override
    public Menu createMenu() {
        return new LoginMenu();
    }
}
