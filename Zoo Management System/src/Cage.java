import java.util.ArrayList;
import java.util.List;

public class Cage {
	private AnimalFamily animalType;
	private int capacity;
	List<Animal> listOfAnimals = new ArrayList<Animal>();

	/**
	 * @param animalType
	 * @param capacity
	 */
	public Cage(AnimalFamily animalType, int capacity) {
		this.animalType = animalType;
		this.capacity = capacity;
	}

	public AnimalFamily getAnimalType() {
		return animalType;
	}

	public int getCapacity() {
		return capacity;
	}

	public List<Animal> getListOfAnimals() {
		return listOfAnimals;
	}

	public void setAnimalType(AnimalFamily animalType) {
		this.animalType = animalType;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void addAnimal(Animal animal) {
		listOfAnimals.add(animal);
	}

	public boolean removeAnimal() {
		boolean removed = false;
		if (listOfAnimals.size() > 0) {
			listOfAnimals.remove(0);
			removed = true;
		}
		return removed;
	}

	public int spareCapacity() {
		return capacity - listOfAnimals.size();
	}

}
