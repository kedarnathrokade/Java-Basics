package learn.StreamsInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;
public class PrintOnlyIntegersInString {
	
	public static void main(String[] args) {
		
		 String[] s = {"abc", "123", "pqr", "456"};
		 
		 List<Integer> numbers = Arrays.stream(s)
				 	.filter(x -> x.matches("[0-9]+")).map(Integer::valueOf)
				 	.collect(Collectors.toList());
		 
		 System.out.println(numbers);
	}

}
