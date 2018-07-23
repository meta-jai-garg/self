package recursion;

public class LCMAndHCF {
	private static int result = 1;

	/**
	 * This method finds LCM of two numbers i.e. x and y using recursion
	 * 
	 * @param x
	 *            is{@code Integer} first number requires x>0
	 * @param y
	 *            is{@code Integer} first number requires y>0
	 * @return Least Common Multiple of x & y
	 */
	static int findLCM(int x, int y) {
		if (result % x == 0 && result % y == 0) {
			return result;
		} else {
			result++;
			findLCM(x, y);
		}
		return result;
	}

	/**
	 * This method finds HCF of two numbers i.e. x and y
	 * 
	 * @param x
	 *            is{@code Integer} first number requires x>0
	 * @param y
	 *            is{@code Integer} first number requires y>0
	 * @return Highest Common Factor of x & y
	 */
	static int findHCF(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return findHCF(y, x % y);
		}
	}
}
