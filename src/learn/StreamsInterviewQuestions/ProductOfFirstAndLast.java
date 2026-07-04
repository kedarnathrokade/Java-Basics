package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfFirstAndLast {
	
	public static void main(String[] args) {
		
		int[] arr = {5,3,2,7,8,3,5};
		
		System.out.println("Using IntStream: ");
		
		IntStream.range(0, arr.length/2).map(x -> arr[x]*arr[arr.length-x-1])
				 .forEach(System.out::println); // Using IntStream
		
		int[] result = IntStream.range(0, arr.length/2)
			.map(x -> arr[x]*arr[arr.length-x-1])
			.toArray();
		
		System.out.println("Using array : \n"+Arrays.toString(result));
		
		List<Integer> ans = IntStream.range(0, arr.length/2)
		.map(x -> arr[x]*arr[arr.length-x-1]).boxed().toList();
		
		System.out.println("Using ArrayList : \n"+ans);
		 
	}

}
