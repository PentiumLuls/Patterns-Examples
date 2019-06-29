package example;

import example.beverage.Beverage;
import example.beverage.Espresso;
import example.beverage.HouseBlend;
import example.condiment.Mocha;
import example.condiment.Soy;
import example.condiment.Whip;

public class StarbuzzCaffe {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        Beverage houseBlend = new Whip(
                new Soy(
                        new Mocha(
                                new HouseBlend()
                        )
                )
        );
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());
    }
}
