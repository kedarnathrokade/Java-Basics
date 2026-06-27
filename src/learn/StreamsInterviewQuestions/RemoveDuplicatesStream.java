package learn.StreamsInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesStream {
	
	public static void main(String[] args) {
		
		String str = "programming";
		
		String result = str.chars()
				.distinct()
				.mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.joining());
				
		System.out.println("Original String: "+str);
		System.out.println("After removing duplicates in String: "+result);
	}
	
	

}
