package edu.mum.cs.cs525.labs.lab4;

public interface Subject {
    public void register(Observer o);
    public void remove(Observer o);
    public void setEnvironment(EnvironmentType type);
}
