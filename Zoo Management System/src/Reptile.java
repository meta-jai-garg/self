public class Reptile extends Animal {
	private final boolean isPoisnous;
	private final String bloodType;

	/**
	 * @param name
	 * @param weight
	 * @param age
	 * @param sound
	 * @param noOfLegs
	 * @param category
	 * @param animalType
	 * @param isPoisnous
	 * @param bloodType
	 */
	public Reptile(String name, double weight, int age, String sound,
			int noOfLegs, AnimalFamily category, AnimalName animalType,
			boolean isPoisnous, String bloodType) {
		super(name, weight, age, sound, noOfLegs, category, animalType);
		this.isPoisnous = isPoisnous;
		this.bloodType = bloodType;
	}

	public boolean isPoisnous() {
		return isPoisnous;
	}

	public String getBloodType() {
		return bloodType;
	}

}
