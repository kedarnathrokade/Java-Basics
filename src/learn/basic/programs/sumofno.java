package learn.basic.programs;

import java.util.Scanner;

public class sumofno {
	
	public static void main(String[] args) {
		
		sumofno s= new sumofno();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int no = sc.nextInt();
		
		
		// Using formula
		//int sum = no*(no+1)/2;
		
		//System.out.println("Sum of no is : "+sum);

		System.out.println("Sum is : "+s.sum(no));

			sc.close();
	}
	
	public int sum(int no)
	{
		if(no!=0)
		{
			return no+ sum(no-1);
			
		}
		
		
		return no;
	}


}