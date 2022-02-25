package edu.mum.cs.cs525.patterns.factory._02_iteration;

public class PizzaStore {

    private SimpleFactory pizzaFactory;

    public void setPizzaFactory(SimpleFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        //this time creating pizza is encapsulated into factory
        pizza = pizzaFactory.createPizza(type);

        pizza.bake();
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.setPizzaFactory(new SimpleFactory());
        Pizza pizza = store.orderPizza("veggy");
        System.out.println("\nYou order is ready, please take :" + pizza.getName());
    }
}
