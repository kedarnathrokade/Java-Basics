package learn.streams;

import java.util.Arrays;

public class NthSmallestNo {
	
	public static void main(String[] args) {
		
		int array[] = {3,2,6,9,24,634,34};
		
		int n=3;		// Third smallest no
		
		int nthsmall = Arrays.stream(array).sorted().skip(n-1).findFirst().orElse(-1);
		
		System.out.println(n+"th Smallest no is : "+nthsmall);
		
	}

}
