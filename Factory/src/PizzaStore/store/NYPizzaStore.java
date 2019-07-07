package PizzaStore.store;

import PizzaStore.pizza.NYStyleCheesePizza;
import PizzaStore.pizza.NYStylePepperoniPizza;
import PizzaStore.pizza.Pizza;
import PizzaStore.PizzaType;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE: {
                return new NYStyleCheesePizza();
            }
            case PEPPERONI: {
                return new NYStylePepperoniPizza();
            }
        }
        return null;
    }
}
