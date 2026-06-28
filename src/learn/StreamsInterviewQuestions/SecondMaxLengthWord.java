package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxLengthWord {
	
	public static void main(String[] args) {
		String s = "I am learning java streams api";
		
		String result = Arrays.stream(s.split(" "))
				.sorted(Comparator.comparing(String::length).reversed())
				.skip(1).findFirst().get();
		
		System.out.println(result);
	}

}
