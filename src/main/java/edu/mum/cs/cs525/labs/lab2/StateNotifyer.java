package edu.mum.cs.cs525.labs.lab2;

import javax.swing.*;

public interface StateNotifyer {
    void register(Observer o);
    void remove(Observer o);
    void sendNotification(Account account, ActionType action);
}
