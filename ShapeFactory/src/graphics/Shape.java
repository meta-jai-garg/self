package graphics;

import java.util.Date;

public interface Shape {
	public enum ShapeType {
		SQUARE, RECTANGLE, CIRCLE, TRIANGLE, REGULAR_POLYGON
	}

	double getArea();

	double getPerimeter();

	Point getOrigin();

	boolean isPointEnclosed(Point point);

	public ShapeType getShapeType();

	public double getOriginDistance();

	public Date getTimestamp();

	public void setTimestamp(Date timestamp);
}
