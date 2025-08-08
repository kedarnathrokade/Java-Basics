package learn.sortings;

public class BubbleSort {
	
	public static void main(String[] args) {
		int array[]= {40,30,23,10,60};
		int i,j,temp;
		
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length-1;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[j];
					array[j]= array[i];
					array[i]=temp;
					
				}
				
			}
		}
		
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
				
	}

}
