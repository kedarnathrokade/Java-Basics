package learn.StreamCollectionPrograms;

import java.util.Arrays;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	private String city;
	//private String email;
	
	public Employee(int id, String name, String department, String city, double salary){
		
		this.id = id;
		this.name = name;
		this.department= department;
		this.salary = salary;
		this.city = city;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", city="
				+ city + "]";
	}
	
	public static List<Employee> getEmployees(){
		
		return Arrays.asList(
				
					new Employee(1,"John", "IT", "Pune", 70000),
					new Employee(2,"Alice", "IT", "Mumbai", 80000),
					new Employee(103, "Bob", "IT", "Pune", 80000),
	                new Employee(104, "David", "Finance", "Delhi", 90000),
	                new Employee(105, "Eva", "HR", "Mumbai", 60000),
	                new Employee(106, "Mike", "IT", "Delhi", 95000),
	                new Employee(107, "Sara", "Finance", "Pune", 75000),
	                new Employee(108, "Tom", "IT", "Mumbai", 65000),
	                new Employee(109, "Chris", "Finance", "Delhi", 85000),
	                new Employee(110, "Emma", "HR", "Pune", 55000)
				
				
				);
	}

}
