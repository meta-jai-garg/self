public class Peacock extends Bird {

	static int id = 1;

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
	public Peacock(double weight, int age, double wingspan) {
		super("Parrot " + (id++), weight, age, "scream", 2, AnimalFamily.BIRD,
				AnimalName.PEACOCK, true, wingspan);
	}
}
