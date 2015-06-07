package behavioral.strategy;

import tools.P;

public abstract class Duck {

	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public Duck() {

	}

	public abstract void display();

	// 委托给行为类
	public void performQuack() {
		quackBehavior.quack();
	}

	// 委托给行为类

	public void performFly() {
		flyBehavior.fly();
	}

	void swim() {
		P.lnrint("All ducks float, even decoys");
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
