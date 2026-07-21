package learn.StreamCollectionPrograms;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentWiseMaxPeopleCount {
	
	public static void main(String[] args) {
		
		Optional<Map.Entry<String, Long>> map = Employee.getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue());
		
		map.ifPresent(x -> System.out.println(x.getKey()+ " : " +x.getValue()));
		
		
	}

}
