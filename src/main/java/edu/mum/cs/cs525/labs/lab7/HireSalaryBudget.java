package edu.mum.cs.cs525.labs.lab7;

import java.util.function.Consumer;

public class HireSalaryBudget implements Consumer<Hire> {
    private double budget;
    @Override
    public void accept(Hire emp) {
        budget += emp.getSalary();
    }

    public double getBudget() {
        return budget;
    }
}
