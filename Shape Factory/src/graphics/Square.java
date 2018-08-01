package graphics;

public class Square implements Shape {
	private Point point;
	private int side;

	public Square(Point point, int side) {
		this.point = point;
		this.side = side;
	}

	@Override
	public float getArea() {
		return side * side;
	}

	@Override
	public float getPerimeter() {
		return 4 * side;
	}

	@Override
	public Point getOrigin() {
		return point;
	}

	@Override
	public boolean isPointEnclosed(Point p) {
		return false;
	}

}
