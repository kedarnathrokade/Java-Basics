package learn.basic.programs;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int number, middle, flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number= sc.nextInt();
		
		if(number == 0 || number == 1)
		{
			System.out.println(number + "is not prime number");
			
		}
		
		else {
			
			middle= number /2;
			
			for(int i=2; i<middle; i++)
			{
				if(number % 2 == 0)
				{
					System.out.println(number + " is not prime number");
					flag =1;
					break;
				}
				
								
			}
			
			if(flag == 0)
			{
				
				System.out.println(number + " is prime number");
				
			}
			
		}
		sc.close();
		
	}
}
