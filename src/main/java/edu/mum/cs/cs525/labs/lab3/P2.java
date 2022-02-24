package edu.mum.cs.cs525.labs.lab3;

public class P2 extends InterestDecorator{

    public P2(InterestCalculator interestCalculator) {
        super(interestCalculator);
    }


    @Override
    public double getInterest(double balance) {
        return 2.0;
    }
}
