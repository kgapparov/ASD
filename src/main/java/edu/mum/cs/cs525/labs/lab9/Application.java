package edu.mum.cs.cs525.labs.lab9;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ComplextTaskService task = ProxyUtility.getProxy();
        System.out.println("Hi I am working, not waiting the proxy");
        task.veryNotComplicatedTask();
//        ComplextTaskService task = new VirtualProxy();
//        System.out.println("I am working without waiting the virtual proxy");

    }
}
