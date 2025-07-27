package learn.basic.sortings;

public class SelectionSort {

	public static void main(String[] args) {
		
		int salary[]= {50,130,420,3500,230,232355};
		int i,j,temp;
		
		for(i=0;i<salary.length;i++)
		{
			for(j=0;j<salary.length;j++)
			{
				if(salary[i]>salary[j])
				{
					temp=salary[j];
					salary[j]=salary[i];
					salary[i]=temp;
					
				}
				
			}
			
		}
		

		for(i=0;i<salary.length;i++)
		{
			System.out.println(salary[i]);
			
		}
	}
}
