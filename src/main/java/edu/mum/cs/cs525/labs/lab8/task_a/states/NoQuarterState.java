package edu.mum.cs.cs525.labs.lab8.task_a.states;

import edu.mum.cs.cs525.labs.lab8.task_a.GumabllMachine;

public class NoQuarterState implements State {
    @Override
    public void insertQuarter(GumabllMachine gm) {
        System.out.println("Congrats, you are going to get gumball. ");
        gm.setState(GumabllMachine.hasQuarterSate);
    }

    @Override
    public void ejectQuarter(GumabllMachine gm) {
        System.out.println("Nothing to eject.");
    }

    @Override
    public void turnCrank(GumabllMachine gm) {
        System.out.println("Insert Coin first please");
    }

    @Override
    public void dispense(GumabllMachine gm) {
        System.out.println("You are not allowed dispense");
    }
}
