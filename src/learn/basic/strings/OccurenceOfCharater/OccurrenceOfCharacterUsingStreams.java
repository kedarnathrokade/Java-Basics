package learn.basic.strings.OccurenceOfCharater;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharacterUsingStreams {
	
	public static void main(String[] args) {
		
		String s = "Java Development".toLowerCase().replaceAll("\\s+", "");
		
		Map<Character, Long> result = s.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		result.forEach((ch,count) -> System.out.println(""+ch+":"+count));
		
		
		
		
		

	
	}

}
