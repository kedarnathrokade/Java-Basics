package learn.EnnovateSolutionsPrograms;

import java.util.stream.Collectors;

@FunctionalInterface
interface AB{
	
	int add(int i, int j);
	
}



public class trying {
	



	public static void main(String args[]){

		AB a = ( i,  j) ->{
				
				return(i+j);
			
			
		};
		
		
		
		
		int res = a.add(10,20);
		
		System.out.println(res	);
		}



		}






