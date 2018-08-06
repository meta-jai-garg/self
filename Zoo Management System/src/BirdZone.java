public class BirdZone extends Zone {

	/**
	 * @param zoneType
	 * @param capacity
	 * @param hasPark
	 * @param hasCanteen
	 */
	public BirdZone(AnimalFamily zoneType, int capacity, boolean hasPark,
			boolean hasCanteen) {
		super(AnimalFamily.BIRD, capacity, hasPark, hasCanteen);
	}

}
