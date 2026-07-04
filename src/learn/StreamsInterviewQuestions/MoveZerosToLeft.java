package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToLeft {
	
	public static void main(String[] args) {
		int[] arr = {5,0,3,0,7,0,5};
		
		// Method 1 : Using Stream.concat() method
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); // converted int[] to Arraylist
		
		List<Integer> result = Stream.concat(list.stream().filter(x -> x==0), list.stream().filter(x -> x!=0))
				.collect(Collectors.toList());
		System.out.println(result);
		
	}

}
