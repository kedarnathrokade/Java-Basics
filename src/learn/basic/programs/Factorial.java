package learn.basic.programs;

public class Factorial {
	
	public static void main(String[] args) {
		
	
	System.out.println("Factorial of number is : "+ fact(5));
		
	}

	public static int fact(int no) {
		
		// Factorial of 0 is 1 
		
		if(no==0) {
			
			return 1;
		}
		
		// returning the factorial no
		
		return no*fact(no-1);
		
		
	}
	
}
