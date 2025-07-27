package learn.basic.EnnovateSolutions;

public class MaxSecondNoInArray {
	
	public static void main(String[] args) {
		
		int a[] =  {10,30,20,530,90,230,230};
		int max=0, premax=0;
		
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>max)
		{
			premax=max;
			max= a[i];	
			
							
		}
		
		else if (a[i]>premax && premax!=max)
		{
			premax=a[i];
			
		}
		
		}
		
		System.out.println("Max no is : "+ max);
		
		System.out.println("2nd Max no is : "+ premax);
	}

}
