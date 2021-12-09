package Strategy;

import Strategy.cuak.Quack;
import Strategy.fly.FlyRocketPowered;

public class MallardDuck extends Duck{
    public MallardDuck () {
        flyBehavior = new FlyRocketPowered();
        cuackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
