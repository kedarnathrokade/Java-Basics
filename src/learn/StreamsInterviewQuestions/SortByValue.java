package learn.StreamsInterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 100);
		map.put("B", 10);
		map.put("H", 50);
		map.put("D", 20);
		map.put("F", 30);
		
		LinkedHashMap<String, Integer> sortedByValue= map.entrySet().stream()
					.sorted(Map.Entry.comparingByValue())
					.collect(Collectors.
							toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
		
		System.out.println(sortedByValue);
	}

}
