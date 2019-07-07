package PizzaStore.store;

import PizzaStore.pizza.ChicagoStyleCheesePizza;
import PizzaStore.pizza.ChicagoStylePepperoniPizza;
import PizzaStore.pizza.Pizza;
import PizzaStore.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE: {
                return new ChicagoStyleCheesePizza();
            }
            case PEPPERONI: {
                return new ChicagoStylePepperoniPizza();
            }
        }
        return new Pizza();
    }
}
