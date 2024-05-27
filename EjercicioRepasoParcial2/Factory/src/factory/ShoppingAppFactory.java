package factory;

import factory.apps.Application;
import factory.apps.ShoppingApp;

public class ShoppingAppFactory implements ApplicationFactory{
    @Override
    public Application createApplication() {
        return new ShoppingApp();
    }
}
