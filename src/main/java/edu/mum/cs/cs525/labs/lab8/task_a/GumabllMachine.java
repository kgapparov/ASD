package edu.mum.cs.cs525.labs.lab8.task_a;


import edu.mum.cs.cs525.labs.lab8.task_a.states.*;

public class GumabllMachine {
    public static final State soldOutState = new SoldOutState();;
    public static final State soldState = new SoldState();
    public static final State hasQuarterSate = new HasQuarterState();
    public static final State noQuarterState = new NoQuarterState();

    private State state;
    private int count = 0;

    public GumabllMachine(int gummballNumber) {
        if (gummballNumber > 0) {
            this.count = gummballNumber;
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter(this);
    }
    public void ejectQuarter(){
        state.ejectQuarter(this);
    }
    public void turnCrank(){
        state.turnCrank(this);
        state.dispense(this);
    }
    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gubball comes rolling out the slot... ");
        if (count > 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }
}
