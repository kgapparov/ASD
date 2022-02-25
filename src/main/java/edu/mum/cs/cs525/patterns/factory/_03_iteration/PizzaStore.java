package edu.mum.cs.cs525.patterns.factory._03_iteration;

public class PizzaStore {

    public PizzaStore(SimpleFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

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
        PizzaStore chicagoStore = new PizzaStore(new ChicagoFactory());
        Pizza pizza = chicagoStore.orderPizza("vegg");
        System.out.println("\nYou order is ready, please take :" + pizza.getName());
    }
}
