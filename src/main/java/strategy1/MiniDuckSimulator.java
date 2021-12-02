package strategy1;

import strategy1.cuak.MuteQuack;
import strategy1.fly.NoFly;

public class MiniDuckSimulator {
    public static void main (String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new NoFly());
        duck.setCuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();
    }
}
