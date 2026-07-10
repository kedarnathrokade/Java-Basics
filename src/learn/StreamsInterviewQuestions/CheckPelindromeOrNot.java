package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckPelindromeOrNot {
	
	public static void main(String[] args) {
		String s = "Level".toLowerCase();
		
	boolean ans = IntStream.range(0, s.length()/2)
			.allMatch(x -> s.charAt(x) == s.charAt(s.length()-x-1));
	
	System.out.println(ans);
	
	
	}

}
