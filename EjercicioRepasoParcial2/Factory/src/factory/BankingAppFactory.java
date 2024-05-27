package factory;

import factory.apps.Application;
import factory.apps.BankingApp;

public class BankingAppFactory implements ApplicationFactory{
    @Override
    public Application createApplication() {
        return new BankingApp();
    }
}
