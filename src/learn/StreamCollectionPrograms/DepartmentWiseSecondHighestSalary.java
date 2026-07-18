package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseSecondHighestSalary {
	
	public static void main(String[] args) {
		
		Map<String, Employee> secondHighestSalaryDept=
				Employee.getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(),
						list -> list.stream()
						.sorted(Comparator.comparing(Employee::getSalary).reversed())
						.skip(1)
						.findFirst()
						.orElse(null))));
		
		System.out.println(secondHighestSalaryDept);
	}

}
