package graphics;

public class Rectangle implements Shape {

	private Point point;
	private int length, breadth;

	public Rectangle(Point point, int length, int breadth) {
		this.point = point;
		this.length = length;
		this.breadth = breadth;
	}

	public Point getPoint() {
		return point;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public float getArea() {
		return length * breadth;
	}

	@Override
	public float getPerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public Point getOrigin() {
		return new Point(point.getX(), point.getY());
	}

	@Override
	public boolean isPointEnclosed(Point point) {
		return false;
	}
}
