package learn.StreamCollectionPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfEmployeesIntoMap {
	
	public static void main(String[] args) {
		
			
		Map<Integer, Employee> ListToMap = Employee.getEmployees().stream()
				.collect(Collectors.toMap(Employee::getId, e -> e));
		
		System.out.println(ListToMap);
		

	}

}
