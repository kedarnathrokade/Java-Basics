package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthWordInString {
	
	public static void main(String[] args) {
		String s = "I am java developer";
		
		String maxLenthWord = Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length)).orElse(null);
		
		System.out.println(maxLenthWord);
	}

}
