package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class UniqueNumbers {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,1,2,4,5);
		
		System.out.println("Unique Elements: "+list.stream().distinct().toList());
		
	}

}
