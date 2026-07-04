package learn.StreamsInterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToRight {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1,0,4,0,8,0,7);
		
		// Solution 1 : Using Stream.concat() method
		
		List<Integer> result = Stream.concat(list.stream()
				.filter(n -> n!=0), list.stream().filter(n -> n==0))
				.collect(Collectors.toList());
		
		System.out.println("Using Stream.concat() method : "+result);
		
		//Solution 2 : filter zeros and non-zeros in two different arraylist and add in result
		
		List<Integer> zeros = list.stream().filter(c -> c==0).collect(Collectors.toList());
		List<Integer> nonZeros = list.stream().filter(n -> n!=0).collect(Collectors.toList());
		List<Integer> ans = new ArrayList<>();
		ans.addAll(nonZeros);
		ans.addAll(zeros);
		
		System.out.println("Using Solution 2 : "+ans);
		
	}

}
