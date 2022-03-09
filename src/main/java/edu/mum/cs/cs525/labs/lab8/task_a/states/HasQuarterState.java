package edu.mum.cs.cs525.labs.lab8.task_a.states;

import edu.mum.cs.cs525.labs.lab8.task_a.GumabllMachine;

public class HasQuarterState implements State {
    @Override
    public void insertQuarter(GumabllMachine gm) {
        System.out.println("You allready inserted coin. Wait until end! ");
    }

    @Override
    public void ejectQuarter(GumabllMachine gm) {
        System.out.println("Quarter returned");
        gm.setState(GumabllMachine.noQuarterState);
    }

    @Override
    public void turnCrank(GumabllMachine gm) {
        System.out.println("You turned... ");
        gm.setState(GumabllMachine.soldState);
    }

    @Override
    public void dispense(GumabllMachine gm) {
        System.out.println("No gumball dispensed");
    }
}