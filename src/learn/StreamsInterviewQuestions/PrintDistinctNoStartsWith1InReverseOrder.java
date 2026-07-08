package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class PrintDistinctNoStartsWith1InReverseOrder {
	
	public static void main(String[] args) {
		
		int arr[] = {12,23,	11,121,54,14321,1341};
		
		List<Integer> result = Arrays.stream(arr).distinct()
		.filter(x ->String.valueOf(x).startsWith("1"))
		.boxed()
		.sorted((a,b) -> b-a)
		.toList();
		
		System.out.println(result);
	}

}
