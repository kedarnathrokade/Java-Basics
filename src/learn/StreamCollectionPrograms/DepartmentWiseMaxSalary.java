package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class DepartmentWiseMaxSalary {
	
	public static void main(String[] args) {
	List<Employee>  employees = List.of(
				
				new Employee(1, "John", "IT", "Pune", 100000),
				new Employee(2, "Alice", "HR", "Mumbai", 80000),
				new Employee(3, "Bob", "IT", "Mumbai", 70000),
				new Employee(4, "Lucy", "Finance", "Pune", 50000)
				);
	
	Map<String, Optional<Employee>> maxDeptSalary = employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))); // With Optional
	
	System.out.println(maxDeptSalary);
	
	Map<String, Employee> maxDeptSalaryWithoutOptional = employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen
					(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),Optional::get)));
	
	System.out.println(maxDeptSalaryWithoutOptional);
	
	
	}

}
