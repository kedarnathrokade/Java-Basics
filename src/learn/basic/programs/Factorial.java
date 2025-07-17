package learn.basic.programs;

public class Factorial {
	
	public static void main(String[] args) {
		
	
	System.out.println("Factorial of number is : "+ fact(5));
		
	}

	public static int fact(int no) {
		
		if(no==0) {
			
			return 1;
		}
		
		return no*fact(no-1);
		
		
	}
	
}
