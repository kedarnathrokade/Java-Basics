package learn.StreamsInterviewQuestions;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String s = "abcdefgcbga";
		
		s.chars().mapToObj(c -> (char)c).distinct().forEach(System.out::print); // 1st way 
		
		System.out.println();
		Arrays.stream(s.split("")).distinct().forEach(System.out::print); // 2nd way
	}

}
