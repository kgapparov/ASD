package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public class FirstGear implements State {
    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed > 0 && speed < 5) {
            return 1;
        }
        if (speed > 5)
            car.setState(Car.secondGear);
        else if (speed == 0) {
            car.setState(Car.parking);
        }
        return car.getState().changeSpeed(speed, car);
    }
}
