package edu.mum.cs.cs525.labs.lab1;

public class SavingAccount extends Account{
    public SavingAccount(String accountNumber) {
        super(accountNumber);
        interest = new SavingInterest();
    }
}
