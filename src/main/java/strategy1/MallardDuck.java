package strategy1;

import strategy1.cuak.Quack;
import strategy1.fly.FlyRocketPowered;

public class MallardDuck extends Duck{
    public MallardDuck () {
        flyBehavior = new FlyRocketPowered();
        cuackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
