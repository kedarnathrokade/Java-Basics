package learn.basic.programs;

public class Factorial {
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		
	System.out.println("Factorial of number is : "+ f.fact(5));
		
	}

	public int fact(int no) {
		
		if(no!=0)
		
		return no*fact(no-1);
		
		else 
			return no;
	}
	
}
