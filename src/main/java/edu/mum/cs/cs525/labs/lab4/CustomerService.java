package edu.mum.cs.cs525.labs.lab4;

public interface CustomerService extends Observer{
    public void getAccountEntries(Account account);
    public void setEnvironment(EnvironmentType type);
}
