package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public abstract class Gear implements State {
    private Car car;

    public Car getCar() {
        return car;
    }

    @Override
    public abstract int changeSpeed(int speed, Car car);
}
