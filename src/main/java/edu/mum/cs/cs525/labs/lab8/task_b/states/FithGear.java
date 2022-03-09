package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public class FithGear implements State {
    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed >= 55) {
            return 5;
        }

        car.setState(Car.fothGear);

        return car.getState().changeSpeed(speed, car);
    }
}
