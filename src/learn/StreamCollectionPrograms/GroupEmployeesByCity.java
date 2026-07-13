package learn.StreamCollectionPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByCity {
	
	public static void main(String[] args) {
		List<Employee> list = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				
				);
		
		Map<String, List<Employee>> ListOfEmployeesByCity = list.stream()
				.collect(Collectors.groupingBy(Employee::getCity));
		
		System.out.println(ListOfEmployeesByCity);
				
 
	
	}

}
