package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;
import edu.mum.cs.cs525.labs.lab8.task_b.states.Gear;

public class ParkingState extends Gear {

    @Override
    public int changeSpeed(int speed, Car car) {
        if (speed == 0) {
            return 0;
        }
        if (speed > 0) {
            car.setState(Car.firstGear);
        }
        return car.getState().changeSpeed(speed, car);
    }
}
