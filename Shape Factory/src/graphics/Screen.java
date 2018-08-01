package graphics;

import java.util.Arrays;

import graphics.Shape.ShapeType;

public class Screen {
	public static void main(String[] args) {
		Shape s = ShapeFactory.createShape(ShapeType.CIRCLE, new Point(10, 10),
				Arrays.asList(5));
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		System.out.println(s.getOrigin().getX() + ", " + s.getOrigin().getY());
		System.out.println(s.isPointEnclosed(new Point(11,12)));
	}
}
