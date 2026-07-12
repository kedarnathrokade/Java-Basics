package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class MaxLengthWordInListOfString {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ram","Sham","Sita","Lakshminarayana");
		
		String result = list.stream()
				.max((a,b) -> Integer.compare(a.length(), b.length()))
				.orElse(null);
		
		System.out.println("Max Length String is : "+result);
	}

}
