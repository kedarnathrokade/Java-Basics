package learn.ImportantInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNumbersUsingSet {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,2,1);
		
		Set<Integer> result = list.stream().collect(Collectors.toSet());
		
		System.out.println("Unique Elements : "+result);
	}

}
