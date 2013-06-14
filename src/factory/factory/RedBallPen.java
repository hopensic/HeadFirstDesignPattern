package factory.factory;

public class RedBallPen extends BallPen {

	public PenCore getPenCore() {
		return new RedPenCore();
	}

}
