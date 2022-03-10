package edu.mum.cs.cs525.labs.lab9;

public class MyNextComplextClass implements ComplextTaskService{
    @Override
    public void veryComplicatedTask() throws InterruptedException {
        System.out.println("My next Very complicated task");
    }

    @Override
    public void veryNotComplicatedTask() throws InterruptedException {
        System.out.println("My next not complicated task");
    }

    public MyNextComplextClass() throws InterruptedException {
        super();
        Thread.sleep(3000);
    }
}
