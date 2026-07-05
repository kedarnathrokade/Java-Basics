package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class SquareOfEachElementInList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,5,6,8,2);
		
		List<Integer> squares = list.stream().map(x -> x*x).toList();
		
		System.out.println(squares);
	}

}
