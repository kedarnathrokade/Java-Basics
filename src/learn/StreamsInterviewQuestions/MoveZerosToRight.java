package learn.StreamsInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToRight {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1,0,4,0,8,0,7);
		
		List<Integer> result = Stream.concat(list.stream()
				.filter(n -> n!=0), list.stream().filter(n -> n==0))
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
