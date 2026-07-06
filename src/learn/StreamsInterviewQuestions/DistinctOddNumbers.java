package learn.StreamsInterviewQuestions;

import java.util.List;

public class DistinctOddNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,3,7,5,7);
		
		List<Integer> distinctOddNO = list.stream().filter(x -> x%2!=0).distinct().toList();
		
		System.out.println(distinctOddNO);
	}

}
