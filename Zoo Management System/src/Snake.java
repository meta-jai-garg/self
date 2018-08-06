public class Snake extends Reptile {

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
	public Snake(double weight, int age) {
		super("Snake " + (id++), weight, age, "hiss", 0, AnimalFamily.REPTILE,
				AnimalName.SNAKE, true, "cold");
	}

}
