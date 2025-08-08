package learn.Factorial;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to calculate the factorial: ");
		int no= sc.nextInt();
		int result= fact(no);
		System.out.println("Factorial of "+no+" is "+result);
		sc.close();
	}

	public static int fact(int no) {
		
		if(no==0)
		{	
			return 1;
		}
		
		else {
			
			return no*fact(no-1);
			
		}
		
	}
}
