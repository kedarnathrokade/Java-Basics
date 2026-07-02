package learn.StreamsInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		  String s = "This is java";
	        
	        char ans = s.chars().mapToObj(c -> (char)c)
	                    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
	                    .entrySet().stream().filter(n -> n.getValue() > 1)
	                    .map(m -> m.getKey())
	                    .findFirst().get();
	        System.out.println(ans);
	}

}
