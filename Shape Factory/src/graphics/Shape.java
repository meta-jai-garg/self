package graphics;

public interface Shape {
	public enum ShapeType {
		SQUARE, RECTANGLE, CIRCLE, TRIANGLE, REGULAR_POLYGON
	}

	float getArea();

	float getPerimeter();

	Point getOrigin();

	boolean isPointEnclosed(Point point);
}
