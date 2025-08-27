package learn.OOPS;

import learn.OOPS.Inheritance.Vehicle;

public class LearnAbstract {
	
	public static void main(String[] args) {
		
	}
	
	

	

}

interface Vehicle{
	
	abstract void print();
	
}

class Car extends Vehicle{
	

	void print() {
		
		System.out.println("This is Vehicle class");
	}
	
}
