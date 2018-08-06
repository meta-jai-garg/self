public class Crocodile extends Reptile {

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
	public Crocodile(double weight, int age) {
		super("Crocodile " + (id++), weight, age, "Roars", 4,
				AnimalFamily.REPTILE, AnimalName.CROCODILE, false, "warm");
	}
}
