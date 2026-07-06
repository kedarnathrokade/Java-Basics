package learn.StreamsInterviewQuestions;

import java.util.List;

public class KthSmallestNumberInList {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(7,5,12,23,8,1,2,5,1);
		int k = 3;
		
		int ans = list.stream().sorted().skip(k-1).findFirst().get();
		System.out.println(ans);
		
		
	}

}
