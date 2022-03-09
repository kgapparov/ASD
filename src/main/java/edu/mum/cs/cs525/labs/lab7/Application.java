package edu.mum.cs.cs525.labs.lab7;

import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        Manager manager1 = new Manager(1, "Manager1", 500.50);
        Manager manager2 = new Manager(2, "Manager1", 500.50);
        Hire person1 = new Employee(1, "Employee1", 300.0);
        Hire person2 = new Employee(1, "Employee1", 300.0);

        HireCounterAction counter = new HireCounterAction();
        HireSalaryBudget budget = new HireSalaryBudget();
        manager1.setEmployees(person1);
        manager1.setEmployees(manager2);
        manager2.setEmployees(person2);
        manager1.execute(counter);
        manager1.execute(budget);

        System.out.println(counter.getCount());
        System.out.println(budget.getBudget());

    }
}
