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
                target = new ComplexClass();
            }
            if (method.getName().startsWith("veryNot")) {
                target.veryNotComplicatedTask();
            }
            target.veryComplicatedTask();
        }

        return null;
    }
}
