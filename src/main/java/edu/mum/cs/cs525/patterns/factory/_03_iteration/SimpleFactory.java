package edu.mum.cs.cs525.patterns.factory._03_iteration;

public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type == "veggy") {
            pizza = new VeggiPizza();
        } else if (type == "Cheese") {
            pizza = new CheesePizza();
        } else {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
