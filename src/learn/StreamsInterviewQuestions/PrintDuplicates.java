package learn.StreamsInterviewQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,2,4,8);
		
		Set<Integer> duplicates = list.stream()
				.collect(Collectors.groupingBy(n->n, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue()>1).map(n -> n.getKey())
				.collect(Collectors.toSet());
		
		System.out.println(duplicates);
	}

}
