package edu.mum.cs.cs525.labs.lab8.task_b;

import edu.mum.cs.cs525.labs.lab8.task_b.states.*;

public class Car{
    public static final State parking = new ParkingState();
    public static final State firstGear = new FirstGear();
    public static final State secondGear = new SecondGear();
    public static final State thirdGear = new ThirdGear();
    public static final State fothGear = new ForthGear();
    public static final State fithGear = new FithGear();

    private State state;
    public Car() {
        state = parking;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int changeSpeed(int speed){
        return state.changeSpeed(speed, this);
    }
}


