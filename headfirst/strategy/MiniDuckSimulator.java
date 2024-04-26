package headfirst.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
		ModelDuck model = new ModelDuck();

		Duck ducks[] = { mallard, rubberDuckie, decoy, model };

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		ducks[0].setEggBehavior(new SpawnEgg());
		ducks[0].performEgg();

		model.copyBehavior(mallard);
		model.performFly();
		model.performQuack();
		model.performEgg();
	}
}
