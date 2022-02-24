package edu.mum.cs.cs525.labs.lab3;

import java.util.ArrayList;
import java.util.List;

public class MainInerest implements InterestCalculator {
    private  List<Integer> interestRange;
    private List<Double> interestValue;


    public MainInerest() {
        interestRange = new ArrayList<>();
        interestValue = new ArrayList<>();
    }

    public void setInterestRangeValue(List<Integer> range, List<Double> value) {
        interestRange = range;
        interestValue = value;
    }

    @Override
    public double getInterest(double balance) {
        int i = 0;
        for (; i < interestRange.size(); ++i) {
            if (balance <= interestRange.get(i)) {
                break;
            }
        }
        return interestValue.get(i);
    }
}
