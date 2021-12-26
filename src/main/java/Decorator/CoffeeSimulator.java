package Decorator;

import Decorator.Beverages.Beverage;
import Decorator.Beverages.Espresso;
import Decorator.Beverages.HouseBlend;
import Decorator.Condiments.Mocha;
import Decorator.Condiments.Whip;

public class CoffeeSimulator {
    public static void main (String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
