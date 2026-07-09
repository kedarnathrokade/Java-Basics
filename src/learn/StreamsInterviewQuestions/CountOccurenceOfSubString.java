package learn.StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class CountOccurenceOfSubString {
	
	public static void main(String[] args) {
		
		String s = "byebyeBirdebye";
		String check = "bye";
		
		long ans = IntStream.range(0, s.length()-2)
			.filter(x -> s.substring(x, x+3).equals(check))
			.count();
		
		System.out.println(ans);
	}

}
