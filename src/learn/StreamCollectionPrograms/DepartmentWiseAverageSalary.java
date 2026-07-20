package learn.StreamCollectionPrograms;

import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseAverageSalary {
	
	public static void main(String[] args) {
		
		Map<String, Double> averageSalaryDeptWise = 
				Employee.getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("Department Wise average salary is : ");
		averageSalaryDeptWise.forEach((dept, sal) -> System.out.println(dept+ " : "+ sal));
		
	}

}
