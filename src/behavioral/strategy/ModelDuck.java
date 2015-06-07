package behavioral.strategy;

import tools.P;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	public void display() {
		// TODO Auto-generated method stub
		P.lnrint("I am a model duck");
	}

}
