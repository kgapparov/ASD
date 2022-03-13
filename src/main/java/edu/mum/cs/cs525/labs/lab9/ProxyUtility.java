package edu.mum.cs.cs525.labs.lab9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyUtility {
    public static <T> T getProxy(Class<T> target){
        return (T) Proxy.newProxyInstance(target.getClassLoader(), target.getInterfaces(), new DynamicProxy());
    }
}