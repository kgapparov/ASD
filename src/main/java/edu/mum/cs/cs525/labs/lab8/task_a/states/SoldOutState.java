package edu.mum.cs.cs525.labs.lab8.task_a.states;

import edu.mum.cs.cs525.labs.lab8.task_a.GumabllMachine;

public class SoldOutState implements State {
    @Override
    public void insertQuarter(GumabllMachine gm) {
        System.out.println("No gumball to sell. Return your money");
    }

    @Override
    public void ejectQuarter(GumabllMachine gm) {
        System.out.println("There nothing to eject");
    }

    @Override
    public void turnCrank(GumabllMachine gm) {
        System.out.println("There nothing to trunc");
    }

    @Override
    public void dispense(GumabllMachine gm) {
        System.out.println("Gumball Machine is empty");
    }
}
