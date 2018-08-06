public class Animal {
	private final String name;
	private double weight;
	private int age;
	private final String sound;
	private final int noOfLegs;
	private AnimalFamily category;
	private AnimalName animalType;

	/**
	 * @param name
	 * @param weight
	 * @param age
	 * @param sound
	 * @param noOfLegs
	 * @param category
	 * @param animalType
	 */
	public Animal(String name, double weight, int age, String sound,
			int noOfLegs, AnimalFamily category, AnimalName animalType) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.sound = sound;
		this.noOfLegs = noOfLegs;
		this.category = category;
		this.animalType = animalType;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getSound() {
		return sound;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public AnimalFamily getCategory() {
		return category;
	}

	public AnimalName getAnimalType() {
		return animalType;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
