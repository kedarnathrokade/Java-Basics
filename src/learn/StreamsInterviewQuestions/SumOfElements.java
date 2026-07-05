package learn.StreamsInterviewQuestions;

import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(2,3,6,4,9,5);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum is : "+sum);
	}
	
}
