public class Bird extends Animal {
	private final boolean canFly;
	private double wingspan;

	/**
	 * @param name
	 * @param weight
	 * @param age
	 * @param sound
	 * @param noOfLegs
	 * @param category
	 * @param animalType
	 * @param canFly
	 * @param wingspan
	 */
	public Bird(String name, double weight, int age, String sound,
			int noOfLegs, AnimalFamily category, AnimalName animalType,
			boolean canFly, double wingspan) {
		super(name, weight, age, sound, noOfLegs, category, animalType);
		this.canFly = canFly;
		this.wingspan = wingspan;
	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public boolean isCanFlay() {
		return canFly;
	}

}
