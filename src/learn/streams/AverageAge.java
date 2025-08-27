package learn.streams;

import java.util.Arrays;
import java.util.List;

public class AverageAge {
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 60)
			);
			double averageAge = persons.stream()
			                          .mapToInt(Person::getAge)
			                          .average()
			                          .orElse(0);
			
			System.out.println("Average age is : "+ averageAge);
	}

}

class Person{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name =name;
		this.age = age;
		
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	
}


