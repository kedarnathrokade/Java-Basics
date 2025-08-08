package learn.OOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Greet g = new Greet();
		
		g.greetings();
		g.greetings("Sham");
		g.greetings("Anuj", 5);
	}
}

class Greet{
	
	void greetings() {
		
		System.out.println("Hello, Good Morning!");
	}
	
void greetings(String name) {
		
		System.out.println("Hello "+name+", Good Morning!");
	}

void greetings(String name, int count) {
	
	for(int i=1; i<=count; i++)
	System.out.println("Hello "+name+", Good Morning!");
}
}