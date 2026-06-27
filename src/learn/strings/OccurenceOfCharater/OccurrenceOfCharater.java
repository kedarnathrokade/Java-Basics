package learn.strings.OccurenceOfCharater;

import java.util.HashMap;
import java.util.Map;
// Occurrence of Character in a String


// Using the Map

public class OccurrenceOfCharater {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		s = s.replaceAll("\\s+", ""); 	// Removing all the spaces
		
		Map<Character, Integer> count = new HashMap<>();    
		
		for(char c: s.toCharArray()) {
			
			c = Character.toLowerCase(c); // converting to lower case 
			
			count.put(c, count.getOrDefault(c, 0)+1); //
		}
		
		System.out.println("Count of charaters :");
		
		for(Map.Entry<Character, Integer> entry : count.entrySet()) {
			
			System.out.println(""+entry.getKey()+":"+entry.getValue()); // Printing the occurrences of characters
		}
		
		
		
		
	}

}
