package graphics;

public class RegularPolygon implements Shape {

	private Point point;
	private int length;
	private int side;

	
	
	public RegularPolygon(Point point, int length, int side) {
		this.point = point;
		this.length = length;
		this.side = side;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point getOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPointEnclosed(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

}
