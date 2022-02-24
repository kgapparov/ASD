package edu.mum.cs.cs525.labs.lab3;

abstract public class InterestDecorator implements InterestCalculator {
    InterestCalculator interestCalculator;
    InterestDecorator(InterestCalculator interestCalculator) {
        this.interestCalculator = interestCalculator;
    }
}
