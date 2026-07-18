
package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseSecondMinSalary {
	
	public static void main(String[] args) {
		
	List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
	
	Map<String, Employee> secondMinSalaryByDept = employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), 
					
					list -> list.stream()
					.sorted(Comparator.comparing(Employee::getSalary))
					.skip(1)
					.findFirst()
					.orElse(null)
					)));
	
	System.out.println(secondMinSalaryByDept);
	}

}
