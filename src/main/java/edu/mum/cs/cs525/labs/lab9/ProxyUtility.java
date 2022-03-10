package edu.mum.cs.cs525.labs.lab9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyUtility {
    public static <ComplexClassService> ComplexClassService getProxy(){
        return (ComplexClassService) Proxy.newProxyInstance(ComplextTaskService.class.getClassLoader(), ComplexClass.class.getInterfaces(), new DynamicProxy());
    }

    public static <ComplexClassService> ComplexClassService getProxy2(){
        return (ComplexClassService) Proxy.newProxyInstance(ComplextTaskService.class.getClassLoader(), MyNextComplextClass.class.getInterfaces(), new DynamicProxy());
    }
}