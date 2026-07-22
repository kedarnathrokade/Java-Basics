package learn.StreamCollectionPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByFirstNameAndLastName {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Bobby", "Smith"),
				new Person("Bobby", "Adams"),
				new Person("John", "Smith"),
				new Person("Alice", "Johnson")
				
				);
		
		 people.stream().sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName)).collect(Collectors.toList())
		 .forEach(System.out::println);;
		
	
	}

}
