package edu.mum.cs.cs525.labs.lab4;

import java.util.ArrayList;
import java.util.List;

public class Environment implements Subject{
    List<Observer> services = new ArrayList<>();
    @Override
    public void register(Observer o) {
        services.add(o);
    }

    @Override
    public void remove(Observer o) {
        services.remove(o);
    }

    @Override
    public void setEnvironment(EnvironmentType type) {
        for (Observer service : services) {
            service.update(type);
        }
    }
}
