package problem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class NaturalSort {

	public static List<Employee> naturalSort(Map<String, Employee> employeeList) {
		List<Employee> sortedList = new ArrayList<Employee>(employeeList.values());
		Collections.sort(sortedList);
		return sortedList;
	}
}
