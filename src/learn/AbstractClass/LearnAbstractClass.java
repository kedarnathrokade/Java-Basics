package learn.AbstractClass;

abstract class Car{
	
	public abstract void drive();
	public abstract void start();
	
	public void playMusic() {
		
		System.out.println("Playing music...");
		
	}
}


abstract class WagonR extends Car{

	@Override
	public void drive() {
		System.out.println("Driving ...");
		
	}
	
}

class UpdatedWagonR extends WagonR{

	@Override
	public void start() {
		System.out.println("Car starting...");
	}
	
	
}

public class LearnAbstractClass {

	public static void main(String[] args) {
		
		Car c = new UpdatedWagonR();
		c.playMusic();
		c.drive();
		c.start();
	}
}
