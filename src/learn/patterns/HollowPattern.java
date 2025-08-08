package learn.patterns;

import java.util.*;
public class HollowPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows and columns to print hollow pattern:");
		int m = sc.nextInt();
		int n= sc.nextInt();
		
		for(int i=1; i<=m; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1 || j==1 || i==m || j==n)
				{
					System.out.print("*");
					
				}
				
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println("");
		}

		sc.close();
	}

}
