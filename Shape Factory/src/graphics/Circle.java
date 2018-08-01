package graphics;

public class Circle implements Shape {

	private Point point;
	private int radius;

	public Circle(Point point, int radius) {
		this.point = point;
		this.radius = radius;
	}

	public Point getPoint() {
		return point;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public float getArea() {
		return 3.14f * radius * radius;
	}

	@Override
	public float getPerimeter() {
		return 2 * 3.14f * radius;
	}

	/**
	 * using section formula
	 */
	@Override
	public Point getOrigin() {
		double x2 = point.getX();
		double y2 = point.getY();
		double distance = Math.sqrt(x2 * x2 + y2 * y2);
		int n = radius;
		double m = distance - n;
		double x = m * x2 / (m + n);
		double y = m * y2 / (m + n);
		return new Point(x, y);
	}

	@Override
	public boolean isPointEnclosed(Point p) {
		double xp = p.getX();
		double yp = p.getY();
		double xc = point.getX();
		double yc = point.getY();
		double X = Math.abs(xp - xc);
		double Y = Math.abs(yp - yc);
		double distance = Math.sqrt(X * X) + Math.sqrt(Y * Y);
		return distance < radius;
	}
}
