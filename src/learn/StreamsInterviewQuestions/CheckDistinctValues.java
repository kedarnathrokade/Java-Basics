package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckDistinctValues {
	public static void main(String[] args) {
		
		int[] arr = {1,4,0,8,5,3,0};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		boolean ans =  list.stream()
				.collect(Collectors.groupingBy(x->x, Collectors.counting()))
				.values().stream().noneMatch(x->x>1);
		
		System.out.println(ans);
				
	}

}
