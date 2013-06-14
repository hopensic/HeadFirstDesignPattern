package factory.factory;

public abstract class BallPen {
	BallPen() {
		System.out.println("生产一只装有" + getPenCore().color + "笔芯的圆珠笔");
	}

	public abstract PenCore getPenCore();

}
