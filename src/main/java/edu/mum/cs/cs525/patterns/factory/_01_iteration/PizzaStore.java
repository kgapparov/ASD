package edu.mum.cs.cs525.patterns.factory._01_iteration;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        //here violating close to modify principle
        if (type == "veggy") {
            pizza = new VeggiPizza();
        } else if (type == "Cheese") {
            pizza = new CheesePizza();
        } else {
            pizza = new GreekPizza();
        }
        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza("veggy");
        System.out.println("\nYou order is ready, please take :" + pizza.getName());
    }
}
