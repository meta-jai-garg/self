public class Lion extends Mammal {

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
	public Lion(double weight, int age) {
		super("Lion " + (id++), weight, age, "Roar", 4, AnimalFamily.MAMMAL,
				AnimalName.LION, false);
	}
}
