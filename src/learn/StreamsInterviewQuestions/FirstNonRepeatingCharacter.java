package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String s = "This is Java Stream Program T";
		
		String result = Arrays.stream(s.split("")).filter(c -> s.indexOf(c) == s.lastIndexOf(c))
			.findFirst().get();
		
		System.out.println(result);
		
		// OR Using HashMap
		
		char ans = 
					s.chars().mapToObj(c -> (char)c)
					.collect(Collectors.groupingBy(c ->c, LinkedHashMap::new, Collectors.counting()))
					.entrySet().stream().filter(c -> c.getValue()==1)
					.map(n -> n.getKey()).findFirst().get();
		
		
		System.out.println(ans);
		
	}

}
