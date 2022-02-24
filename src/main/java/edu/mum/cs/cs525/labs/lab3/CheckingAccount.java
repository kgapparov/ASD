package edu.mum.cs.cs525.labs.lab3;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interest = new CheckingInterest();
    }

}
