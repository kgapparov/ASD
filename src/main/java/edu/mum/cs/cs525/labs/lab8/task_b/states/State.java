package edu.mum.cs.cs525.labs.lab8.task_b.states;

import edu.mum.cs.cs525.labs.lab8.task_b.Car;

public interface State {
    int changeSpeed(int speed, Car car);;
}
