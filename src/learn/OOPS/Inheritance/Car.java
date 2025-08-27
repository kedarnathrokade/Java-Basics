package learn.OOPS.Inheritance;


public class Car extends Vehicle{
	
	
	Car(){
		
		System.out.println("This is constructor of Car class");
	}
	
	void start() {
		
		super.start(); // This will call the start method immediate parent class i.e Vehicle class
		
		System.out.println("Car is starting");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.wheels= 4;
		c.color="White";
		c.start();
	}


	
	
	
	

}
