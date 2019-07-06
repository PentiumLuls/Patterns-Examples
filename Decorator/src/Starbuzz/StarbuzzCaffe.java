package Starbuzz;

import Starbuzz.beverage.Beverage;
import Starbuzz.beverage.Espresso;
import Starbuzz.beverage.HouseBlend;
import Starbuzz.condiment.Mocha;
import Starbuzz.condiment.Soy;
import Starbuzz.condiment.Whip;

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
