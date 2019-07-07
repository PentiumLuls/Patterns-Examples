package PizzaStore.store;

import PizzaStore.pizza.Pizza;
import PizzaStore.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        System.out.printf("You have order %s%n", pizza.getName());

        return pizza.prepare()
                .bake()
                .cut()
                .box();
    }

    public abstract Pizza createPizza(PizzaType type);
}
