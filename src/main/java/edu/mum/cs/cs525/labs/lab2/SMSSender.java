package edu.mum.cs.cs525.labs.lab2;

import java.sql.Timestamp;

public class SMSSender implements  Observer{
    private StateNotifyer subject;
    SMSSender(StateNotifyer subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(Account account, ActionType action) {
        Long second = System.currentTimeMillis();
        Timestamp time = new Timestamp(second);
        System.out.printf("%15s%30s%20s%20s\n", "SMS: level: Informational",time.toString(), action, "Account# "+account.getAccountNumber());
    }
}
