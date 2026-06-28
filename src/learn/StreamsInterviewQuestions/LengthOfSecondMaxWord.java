package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class LengthOfSecondMaxWord {
	
	public static void main(String[] args) {
		String s = "I am learning java streams api";
		
		Integer result= Arrays.stream(s.split(" "))
				.map(x -> x.length())
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		
		System.out.println("Length of second max word: "+result);
	}

}
