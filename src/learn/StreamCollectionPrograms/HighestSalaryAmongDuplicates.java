package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class HighestSalaryAmongDuplicates {
	
	public static void main(String[] args) {
		
		List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
		
		Map<Integer, Employee> HighetSalaryAmongDuplicates = employees.stream()
				.collect(Collectors.toMap(Employee::getId, e-> e, BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println(HighetSalaryAmongDuplicates);
		
	}

}
