package factory;

import factory.apps.Application;
import factory.apps.GameApp;

public class GameAppFactory implements ApplicationFactory{
    @Override
    public Application createApplication() {
        return new GameApp();
    }
}
