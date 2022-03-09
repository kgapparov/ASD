package edu.mum.cs.cs525.labs.lab8.task_a.states;

import edu.mum.cs.cs525.labs.lab8.task_a.GumabllMachine;

public class SoldState implements State {
    @Override
    public void insertQuarter(GumabllMachine gm) {
        System.out.println("You can't entry it is allready processing other perchase.");
    }

    @Override
    public void ejectQuarter(GumabllMachine gm) {
        System.out.println("You can't eject, you already turned Crank. ");
    }

    @Override
    public void turnCrank(GumabllMachine gm) {
        System.out.println("Turning twice does not get you another gumball. ");
    }

    @Override
    public void dispense(GumabllMachine gm) {
        gm.releaseBall();
        if (gm.getCount() > 0) {
            gm.setState(GumabllMachine.noQuarterState);
        } else {
            System.out.println("Oops, out of gumballs");
            gm.setState(GumabllMachine.soldOutState);
        }
    }
}
