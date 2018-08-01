package graphics;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getY() {
		return Math.round(y * 100.) / 100.;
	}

	public double getX() {
		return Math.round(x * 100.) / 100.;
	}

}
