package behavioral.strategy;

import tools.P;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		// TODO Auto-generated method stub
		P.lnrint("I am a real Mallard duck");
	}

}
