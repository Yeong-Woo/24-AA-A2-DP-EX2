package headfirst.strategy;

public class SpawnEgg implements EggBehavior {
    @Override
    public void spawn() {
        System.out.println("Spawn.");
    }
}
