package learn.patterns;

public class ButterflyPattern {
	
	public static void main(String[] args) {
		
		int num =5;
		
		for(int i = 1; i<=num; i++)
		{
			for(int j = 1; j<=num; j++)
			{
				 System.out.print("* ");
				
			}
			
			int spaces = 2*(num-i);
			
			for(int j=1; j<= spaces; i++) {
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		
		
		for(int i = num; i>0; i--)
		{
			for(int j = i; j>0; j--)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
	}

}
