package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.List;

public class NthHighestSalaryPaid {
	
	public static void main(String[] args) {
		
		List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
		
		int n =2;
		
		Employee highestNthSalary = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(n-1)
				.findFirst()
				.orElse(null);
		
		System.out.println(highestNthSalary);
				
	}

}
