package learn.ImportantInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
	
	// Character counting
	
			public static void main(String args[]){
	
			String str = "Welcome to India ";
	
			Map<Character, Long> result = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			result.forEach((ch,count)->{
				
				if(count >= 2) {
					System.out.println(ch+": "+count);
				}
				
			});
	
			}


	

}
