package edu.mum.cs.cs525.labs.lab2;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Logger implements Observer{
    StateNotifyer subject;
    Logger(StateNotifyer subject) {
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void update(Account account, ActionType action) {
        Long second = System.currentTimeMillis();
        Timestamp  time = new Timestamp(second);
        System.out.printf("%25s%30s%20s%20s\n", "Logger: level: Informational",time.toString(), action, "Account# "+account.getAccountNumber());
    }
}
