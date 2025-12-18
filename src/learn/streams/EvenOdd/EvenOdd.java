package learn.streams.EvenOdd;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,34,5);
		
		System.out.println("Even numbers");
		
		list.stream().filter(n -> n%2 ==0).forEach(System.out::println);
		
		System.out.println("Odd numbers");
		
		list.stream().filter(n -> n%2 !=0).forEach(System.out::println);
		
		
	}

}
