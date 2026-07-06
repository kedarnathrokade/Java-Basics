package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertStringsToUpperCase {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("breaking bad", "big bag theory", "welcome");
		
		List<String> result = list.stream()
				.map(x-> x.toUpperCase())
				.collect(Collectors.toList()); // Solution 1
		
		List<String> result2 = list.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println("Using lambda fuction : "+result);
		System.out.println("Using method reference: "+result2);
		
	}

}
