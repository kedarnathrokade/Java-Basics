package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		double average = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble(); //Solution 1
		
		double ans = list.stream().mapToInt(x->x).average().getAsDouble();
		
		System.out.println(average);
		System.out.println(ans);
	}

}
