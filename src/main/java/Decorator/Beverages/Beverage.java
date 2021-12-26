package Decorator.Beverages;

public abstract class Beverage {

    String description = "Unknown beverage";

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
