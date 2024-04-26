package headfirst.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		// quackBehavior = new Quack();
		quackBehavior = new DoubleQuack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}

	public void copyBehavior(Duck source) {
		flyBehavior = source.flyBehavior;
		quackBehavior = source.quackBehavior;
		eggBehavior = source.eggBehavior;
	}
}
