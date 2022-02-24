package edu.mum.cs.cs525.labs.lab3;

public class P3 extends InterestDecorator{
    public P3(InterestCalculator interestCalculator) {
        super(interestCalculator);
    }

    @Override
    public double getInterest(double balance) {
        return 3.0;
    }
}
