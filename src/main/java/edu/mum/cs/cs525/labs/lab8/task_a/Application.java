package edu.mum.cs.cs525.labs.lab8.task_a;

public class Application {
    public static void main(String[] args) {
        GumabllMachine machine = new GumabllMachine(10);
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
    }
}
