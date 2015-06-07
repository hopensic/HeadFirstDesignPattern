package behavioral.strategy;

import tools.P;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		P.lnrint(" quick with silent");
	}

}
