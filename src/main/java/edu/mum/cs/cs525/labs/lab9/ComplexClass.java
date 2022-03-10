package edu.mum.cs.cs525.labs.lab9;

public class ComplexClass implements ComplextTaskService{
    public ComplexClass () throws InterruptedException{
        super();
        Thread.sleep(10000);
    }
    public void veryComplicatedTask(){
        System.out.println("Very complicated task");
    }
    public void veryNotComplicatedTask(){
        System.out.println("Very Not complicated task");
    }
}
