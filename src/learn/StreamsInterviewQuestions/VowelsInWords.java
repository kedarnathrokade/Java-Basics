package learn.StreamsInterviewQuestions;

import java.util.Arrays;

public class VowelsInWords {
	
	public static void main(String[] args) {
		String s = "I am learning java streams api";
		
		Arrays.stream(s.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIO]", "").length()==2)
		.forEach(System.out::println);
	
	}

}
