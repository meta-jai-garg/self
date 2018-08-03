package counseling;

public class Programs {
	private String name;
	private int capacity;
	/**
	 * @param name
	 * @param capacity
	 */
	public Programs(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
