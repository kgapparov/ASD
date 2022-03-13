package edu.mum.cs.cs525.labs.lab9;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ComplextTaskService task1 = ProxyUtility.getProxy(ComplexClass.class);
        ComplextTaskService task2 = ProxyUtility.getProxy(MyNextComplextClass.class);
        System.out.println("Hi I am working, not waiting the proxy instantiation");
//        task1.veryComplicatedTask();
//        task2.veryComplicatedTask();
        for (int i = 0; i < 12; i++) {
            Thread.sleep(1000);
            System.out.println("Doing our tasks " + i);
        }
    }
}
