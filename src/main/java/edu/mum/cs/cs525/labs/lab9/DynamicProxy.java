package edu.mum.cs.cs525.labs.lab9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    ComplextTaskService target = null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("very")) {
            if (target == null) {
                System.out.println("We are creating instance... Please wait");

                Thread runnerThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            target = new ComplexClass();
                            executeCondition(method, target);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                 });
                runnerThread.start();
            } else {
               executeCondition(method, target);
            }
        }

        return null;
    }

    private void executeCondition(Method method, ComplextTaskService target) throws InterruptedException {
        if (method.getName().startsWith("veryNot"))
            target.veryNotComplicatedTask();
        else
            target.veryComplicatedTask();
    }
}
