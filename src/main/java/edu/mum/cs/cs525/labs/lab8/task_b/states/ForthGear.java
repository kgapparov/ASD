package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public class ForthGear implements State {
    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed >= 30 && speed < 55) {
            return 4;
        }
        if (speed < 30) {
            car.setState(Car.thirdGear);
        } else
            car.setState(Car.fithGear);

        return car.getState().changeSpeed(speed, car);
    }
}
