import java.util.ArrayList;
import java.util.List;

public class Zone {
	private AnimalFamily zoneType;
	private final int capacity;
	List<Cage> listOfCages = new ArrayList<Cage>();
	private boolean hasPark, hasCanteen;

	/**
	 * @param zoneType
	 * @param capacity
	 * @param hasPark
	 * @param hasCanteen
	 */
	public Zone(AnimalFamily zoneType, int capacity, boolean hasPark,
			boolean hasCanteen) {
		this.zoneType = zoneType;
		this.capacity = capacity;
		this.hasPark = hasPark;
		this.hasCanteen = hasCanteen;
	}

	public AnimalFamily getZoneType() {
		return zoneType;
	}

	public void setZoneType(AnimalFamily zoneType) {
		this.zoneType = zoneType;
	}

	public boolean isHasPark() {
		return hasPark;
	}

	public boolean isHasCanteen() {
		return hasCanteen;
	}

	public void setHasPark(boolean hasPark) {
		this.hasPark = hasPark;
	}

	public void setHasCanteen(boolean hasCanteen) {
		this.hasCanteen = hasCanteen;
	}

	public int getCapacity() {
		return capacity;
	}

	public int spareCapacity() {
		return capacity - listOfCages.size();
	}

	public List<Cage> getListOfCages() {
		return listOfCages;
	}

	public void addCage(Cage cage) {
		if (spareCapacity() != 0) {
			listOfCages.add(cage);
		} else {
			throw new AssertionError("Zone is full");
		}
	}

	public boolean addAnimal(Animal animal) {
		boolean flag = false;
		for (Cage cage : listOfCages) {
			if (cage.getAnimalType().equals(animal.getAnimalType())
					&& cage.spareCapacity() != 0) {
				flag = true;
				cage.addAnimal(animal);
				break;
			}
		}
		if (!flag) {
			throw new AssertionError("Zone capacity is full");
		}
		return flag;
	}

	public boolean removeAnimal(AnimalName animalName){
		boolean removed = false;
		for(Cage cage : listOfCages){
			if(cage.getAnimalType().equals(animalName)){
				removed = cage.removeAnimal();
			}
		}
		return removed;
	}
}
