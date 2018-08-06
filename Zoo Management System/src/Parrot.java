public class Parrot extends Bird {

	static int id = 1;

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
	public Parrot(double weight, int age, double wingspan) {
		super("Parrot " + (id++), weight, age, "squawk", 2, AnimalFamily.BIRD,
				AnimalName.PARROT, true, wingspan);
	}

}
