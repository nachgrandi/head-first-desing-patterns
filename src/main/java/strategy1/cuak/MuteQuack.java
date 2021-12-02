package strategy1.cuak;

public class MuteQuack implements CuackBehavior{
    @Override
    public void cuak() {
        System.out.println("Sounds... of the silent");
    }
}
