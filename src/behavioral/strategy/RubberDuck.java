package behavioral.strategy;

import tools.P;

public class RubberDuck extends Duck {

	void quick() {
		P.lnrint("squeak squeak squeak");
	}

	void fly() {
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		P.lnrint("rubber duck");
	}

}
