package problem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SortByName {
	public static List<Employee> sortByName(Map<String, Employee> employeeList) {
		List<Employee> sortedListByName = new ArrayList<Employee>(
				employeeList.values());
		Collections.sort(sortedListByName, Employee.NameComparator);
		return sortedListByName;
	}
}
