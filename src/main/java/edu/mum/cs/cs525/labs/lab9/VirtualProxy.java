package edu.mum.cs.cs525.labs.lab9;

public class VirtualProxy implements ComplextTaskService{
    private ComplexClass task = null;
    @Override
    public void veryComplicatedTask() throws InterruptedException {
        if (task == null) {
            System.out.println("please wait instatiation...");
            task = new ComplexClass();
            task.veryComplicatedTask();
        } else {
            task.veryComplicatedTask();
        }
    }

    @Override
    public void veryNotComplicatedTask() throws InterruptedException {

    }
}
