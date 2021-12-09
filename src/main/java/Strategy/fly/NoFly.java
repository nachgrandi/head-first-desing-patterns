package Strategy.fly;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Sadly i can't fly");
    }
}
