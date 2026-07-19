package learn.StreamCollectionPrograms;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseNthMinSalary {
	
	public static void main(String[] args) {
		
		int n=2;
		
		Map<String,Employee> NthMinDepartmentWiseSalary = 
				Employee.getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
					.sorted(Comparator.comparing(Employee::getSalary))
					.skip(n-1)
					.findFirst()
					.orElse(null)
						)));
		
		System.out.println(NthMinDepartmentWiseSalary);
	}

}
