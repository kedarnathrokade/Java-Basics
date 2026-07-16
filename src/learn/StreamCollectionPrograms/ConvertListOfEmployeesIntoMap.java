package learn.StreamCollectionPrograms;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfEmployeesIntoMap {
	
	public static void main(String[] args) {
		
			
		Map<Integer, Employee> ListToMap = Employee.getEmployees().stream()
				.collect(Collectors.toMap(Employee::getId, e -> e));  // This is for without duplicate keys
		
		// if duplicate keys are present then it will throws : IllegalStateException: Duplicate key 
		
		System.out.println("Without duplicates: "+ListToMap);
		
		Map<Integer, Employee> ListToMapWithOldDuplicates = Employee.getEmployees().stream()
				.collect(Collectors.toMap(Employee::getId, e-> e, (oldValue, newValue) -> oldValue)); // This will keep old duplicate values
		
		System.out.println("With Duplicates and updating old values: "+ListToMapWithOldDuplicates);
		
		
		

	}

}
