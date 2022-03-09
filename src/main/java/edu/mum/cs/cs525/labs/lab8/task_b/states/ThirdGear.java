package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public class ThirdGear implements State {
    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed >= 10 && speed < 30) {
            return 3;
        }
        if (speed < 10) {
            car.setState(Car.secondGear);
        } else
            car.setState(Car.fothGear);

        return car.getState().changeSpeed(speed, car);
    }
}
