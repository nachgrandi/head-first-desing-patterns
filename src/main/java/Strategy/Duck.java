package Strategy;

import Strategy.cuak.CuackBehavior;
import Strategy.fly.FlyBehavior;
public abstract class Duck {
    FlyBehavior flyBehavior;
    CuackBehavior cuackBehavior;

    public abstract void display();

    public void performFly () {
        flyBehavior.fly();
    }

    public void performQuack () {
        cuackBehavior.cuak();
    }

    public void setFlyBehavior (FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setCuackBehavior (CuackBehavior cb) {
        this.cuackBehavior = cb;
    }
}
