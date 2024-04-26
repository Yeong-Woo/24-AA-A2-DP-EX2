package headfirst.strategy;

public class SpawnNothing implements EggBehavior {
    @Override
    public void spawn() {
        System.out.println("Spawn nothing.");
    }
}
