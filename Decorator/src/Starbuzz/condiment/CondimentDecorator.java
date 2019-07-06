package Starbuzz.condiment;

import Starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
