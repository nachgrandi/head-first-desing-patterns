package Strategy.fly;


public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly like a fucking rocket");
    }
}
