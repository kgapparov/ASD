package edu.mum.cs.cs525.labs.lab9;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ComplextTaskService task = ProxyUtility.getProxy();
        System.out.println("Hi I am working, not waiting the proxy instantiation");
        ComplextTaskService task2 = ProxyUtility.getProxy2();
        task.veryNotComplicatedTask();
        task2.veryNotComplicatedTask();
    }
}
