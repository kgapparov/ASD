package edu.mum.cs.cs525.labs.lab8.task_a.states;

import edu.mum.cs.cs525.labs.lab8.task_a.GumabllMachine;

public interface State {
    void insertQuarter(GumabllMachine gm);
    void ejectQuarter(GumabllMachine gm);
    void turnCrank(GumabllMachine gm);
    void dispense(GumabllMachine gm);
}