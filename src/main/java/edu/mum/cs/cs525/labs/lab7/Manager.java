package edu.mum.cs.cs525.labs.lab7;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire{
    private List<Hire> employees;
    @Override
    public void execute(Consumer<Hire> action) {
        action.accept(this);
        for(Hire em : this.employees) {
            em.execute(action);
        }
    }

    public Manager(int id, String name, Double salary) {
        super(id, name, salary);
        this.employees = new LinkedList<>();
    }

    public void setEmployees(Hire employee) {
        this.employees.add(employee);
    }
}
