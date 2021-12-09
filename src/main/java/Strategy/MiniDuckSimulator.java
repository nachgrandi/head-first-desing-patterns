package Strategy;

import Strategy.cuak.MuteQuack;
import Strategy.fly.NoFly;

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
