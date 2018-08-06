public class Elephant extends Mammal {

	static int id = 1;

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
	public Elephant(double weight, int age) {
		super("Elephant " + (id++), weight, age, "Trumpet", 4,
				AnimalFamily.MAMMAL, AnimalName.ELEPHANT, false);
	}

}
