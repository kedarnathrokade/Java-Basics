package learn.StreamCollectionPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCityGetOnlyNameAndDepartment {
	
	public static void main(String[] args) {
		
List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
		
	Map<String, List<String>> result = employees.stream()
			.collect(Collectors.groupingBy(Employee::getCity, 
				Collectors.mapping(e -> e.getName() +" - "+ e.getDepartment(), Collectors.toList())));
	
	System.out.println(result);
	
	
	record EmployeeDTO(String name, String department) {} // Java  16+
	
	Map<String, List<EmployeeDTO>> result1 = Employee.getEmployees().stream()
	        .collect(Collectors.groupingBy(
	                Employee::getCity,
	                Collectors.mapping(
	                        e -> new EmployeeDTO(e.getName(), e.getDepartment()),
	                        Collectors.toList())));
	
	System.out.println(result1);
	
	
	}

}
