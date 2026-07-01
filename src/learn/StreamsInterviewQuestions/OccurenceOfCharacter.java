package learn.StreamsInterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
	
	// Character counting
	
			public static void main(String args[]){
	
			String str = "Welcome to India ";
	
			Map<Character, Long> result = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			System.out.println("Occurence of Characters: "+result);
			System.out.println();
			
			System.out.println("Only Duplicate Characters: ");
			
			
			result.forEach((ch,count)->{
				
				if(count >1) {
					System.out.println(ch+": "+count); // It will print duplicate characters
				}
				
			});
	
			}


	

}
