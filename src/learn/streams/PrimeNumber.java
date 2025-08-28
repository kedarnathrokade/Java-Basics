package learn.streams;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
	
	public static boolean isPrime(int number) {
		
		if(number <=1) {
			
			return false;
		}
		
		for(int i = 2; i<=Math.sqrt(number); i++) {
			
			if(i %2 == 0)
			{
				return false;
			}
			
			
		}
		
		return true;

	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,7,8,9);
		
		boolean containsPrime = list.stream()
									.anyMatch(PrimeNumber::isPrime);
		
		System.out.println("Prime numbers are : "+containsPrime);
		
	}

}
