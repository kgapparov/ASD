package edu.mum.cs.cs525.patterns.factory._04_iteration;

public class NYPizzaStrore extends PizzaStore{
    @Override
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

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStrore();
        PizzaStore chicagoStore = new ChicagoStrore();
        store.orderPizza("veggy");
        chicagoStore.orderPizza("veggy");
    }
}
