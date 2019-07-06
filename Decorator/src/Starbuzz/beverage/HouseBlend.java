package Starbuzz.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
