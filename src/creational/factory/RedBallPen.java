package creational.factory;

public class RedBallPen extends BallPen {

	public PenCore getPenCore() {
		return new RedPenCore();
	}

}
