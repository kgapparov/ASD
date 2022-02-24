package edu.mum.cs.cs525.labs.lab3;

public class P1 extends InterestDecorator{

    P1(InterestCalculator interestCalculator) {
        super(interestCalculator);
    }

    @Override
    public double getInterest(double balance) {
        return 1.0 + interestCalculator.getInterest(balance);
    }
}
