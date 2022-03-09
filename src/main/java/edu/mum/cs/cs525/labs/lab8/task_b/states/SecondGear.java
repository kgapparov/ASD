package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public class SecondGear implements State {
    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed >= 5 && speed < 10) {
            return 2;
        }
        if (speed < 5) {
            car.setState(Car.firstGear);
        } else
            car.setState(Car.thirdGear);

        return car.getState().changeSpeed(speed, car);
    }
}
