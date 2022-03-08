package edu.mum.cs.cs525.labs.lab7;

import java.util.function.Consumer;

public abstract class Hire {
    private int id;
    private String name;
    private Double salary;

    public Hire(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void execute(Consumer<Hire> action) {
        action.accept(this);
    }
}
