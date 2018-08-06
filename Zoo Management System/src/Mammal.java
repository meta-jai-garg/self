public class Mammal extends Animal {
	private final boolean hasFur;

	/**
	 * @param name
	 * @param weight
	 * @param age
	 * @param sound
	 * @param noOfLegs
	 * @param category
	 * @param animalType
	 * @param hasFur
	 */
	public Mammal(String name, double weight, int age, String sound,
			int noOfLegs, AnimalFamily category, AnimalName animalType,
			boolean hasFur) {
		super(name, weight, age, sound, noOfLegs, category, animalType);
		this.hasFur = hasFur;
	}

	public boolean hasFur() {
		return hasFur;
	}

}
