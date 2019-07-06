package Starbuzz.beverage;

public abstract class Beverage {
    private String description;

    public abstract double cost();

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
