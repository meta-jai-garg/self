package graphics;

public class Triangle implements Shape {

	private Point point;
	private int sideA, sideB, sideC;
	
	/**
	 * @param point
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	public Triangle(Point point, int sideA, int sideB, int sideC) {
		this.point = point;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
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
