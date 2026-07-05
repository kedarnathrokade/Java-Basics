package learn.StreamsInterviewQuestions;

import java.util.List;

public class SortElementsByAphabeticalOrder {
	
	public static void main(String[] args) {
		List<String> list = List.of("Zudio", "Croma", "Zara","Puma","RedTape");
		
		List<String> sortedStr = list.stream().sorted().toList();
		
		System.out.println(sortedStr);
	}

}
