package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.List;

public class HighestSalary {
	
	public static void main(String[] args) {
		
		List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
		
		Employee highestSalary = employees.stream()
				.max(Comparator.comparing(Employee::getSalary))
				.orElse(null);
		
		System.out.println(highestSalary);
		
	}

}
