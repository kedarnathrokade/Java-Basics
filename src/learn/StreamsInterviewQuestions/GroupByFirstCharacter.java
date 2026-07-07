package learn.StreamsInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstCharacter {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("apple", "banana","acrot","pineapple");
		
		Map<Character, Long> ans = list.stream()
				.collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
		System.out.println(ans);
				
		
	}

}
