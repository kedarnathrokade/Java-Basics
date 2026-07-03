package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfFirstTwoElements {
	
	public static void main(String[] args) {
		int[] arr = {12,5,20,30,10,15};
		
		int result = Arrays.stream(arr).boxed()
				.collect(Collectors.toList())
				.stream().limit(2)
				.reduce(1, (a,b) ->a*b);
		
		System.out.println(result);
	}

}
