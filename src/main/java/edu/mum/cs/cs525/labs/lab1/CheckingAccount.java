package edu.mum.cs.cs525.labs.lab1;

public class CheckingAccount extends Account{
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
        interest = new CheckingInterest();
    }

}
