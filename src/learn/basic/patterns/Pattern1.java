package learn.basic.patterns;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		
		int m;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of row and colummns to print pattern:");
		m= sc.nextInt();
		n = sc.nextInt();
		
		//Outer Loop
		for(int i =1; i<=m; i++)
		{
			//Inner Loop
			for(int j=1; j<=n; j++)
			{
				
				System.out.print("*");// Printing star
			}
			
			System.out.println();
			
			
		}
		sc.close();
	}
}
