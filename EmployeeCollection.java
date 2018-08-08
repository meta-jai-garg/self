package problem1;
import java.util.HashMap;
import java.util.Map;

public class EmployeeCollection {
	
	private Map<String, Employee> employeeDetails = new HashMap<String, Employee>();

	public boolean addEmployee(String empId, String name, String address) {
		boolean isAdded = false;
		if (employeeDetails.containsKey(empId)) {
			throw new AssertionError("Employee already exist");
		} else {
			employeeDetails.put(empId, new Employee(empId, name, address));
			isAdded = true;
		}
		return isAdded;
	}

	public Map<String, Employee> getEmployeeDetails() {
		return employeeDetails;
	}

}
