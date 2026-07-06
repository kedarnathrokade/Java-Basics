package learn.StreamsInterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Intersection {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(3,8,5,9);
		
		List<Integer> intersection = list1.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());
		
		System.out.println(intersection);

	}

}
