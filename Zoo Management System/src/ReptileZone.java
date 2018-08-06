public class ReptileZone extends Zone {

	/**
	 * @param zoneType
	 * @param capacity
	 * @param hasPark
	 * @param hasCanteen
	 */
	public ReptileZone(AnimalFamily zoneType, int capacity, boolean hasPark,
			boolean hasCanteen) {
		super(AnimalFamily.REPTILE, capacity, hasPark, hasCanteen);
	}

}
