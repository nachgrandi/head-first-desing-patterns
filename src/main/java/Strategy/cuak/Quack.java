package Strategy.cuak;

public class Quack implements CuackBehavior{
    @Override
    public void cuak() {
        System.out.println("Cuak!");
    }
}
