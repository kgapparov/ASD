package edu.mum.cs.cs525.labs.lab2;

import java.sql.Timestamp;

public class EmailSender implements Observer{
    StateNotifyer subject;

    public EmailSender(StateNotifyer subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(Account account, ActionType action) {
        Long second = System.currentTimeMillis();
        Timestamp time = new Timestamp(second);

        if (action ==ActionType.CREATEACCOUNT) {
            System.out.println("Email: Hi Mr(Ms) "+account.getCustomer().getName()+" your account with number " + account.getAccountNumber() + " is created succesfully.");
        }
    }
}
