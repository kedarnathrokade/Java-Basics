package learn.StreamsInterviewQuestions;

import java.util.Arrays;

public class SumOfUniqueElements {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,7,3,2};
		
		int sum = Arrays.stream(arr).distinct().sum();
		System.out.println(sum);
	}

}
