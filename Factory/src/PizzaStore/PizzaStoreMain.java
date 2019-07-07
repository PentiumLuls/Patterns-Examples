package PizzaStore;

import PizzaStore.pizza.Pizza;
import PizzaStore.store.ChicagoPizzaStore;
import PizzaStore.store.NYPizzaStore;
import PizzaStore.store.PizzaStore;

public class PizzaStoreMain {

    public static void main(String[] args) {
        System.out.println("~~Welcome to pizza store~~");

        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.printf("Here is your %s~%n", nyCheesePizza.getName());

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.printf("Here is your %s~%n", chicagoPepperoniPizza.getName());
    }
}
