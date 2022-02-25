package edu.mum.cs.cs525.patterns.factory._04_iteration;

public class ChicagoStrore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type == "veggy") {
            pizza = new ChicagoVeggiPizza();
        } else if (type == "Cheese") {
            pizza = new ChicagoCheesePizza();
        } else {
            pizza = new ChicagoGreekPizza();
        }
        return pizza;
    }
}
