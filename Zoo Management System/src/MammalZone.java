public class MammalZone extends Zone {

	/**
	 * @param zoneType
	 * @param capacity
	 * @param hasPark
	 * @param hasCanteen
	 */
	public MammalZone(AnimalFamily zoneType, int capacity, boolean hasPark,
			boolean hasCanteen) {
		super(AnimalFamily.MAMMAL, capacity, hasPark, hasCanteen);
	}

}
