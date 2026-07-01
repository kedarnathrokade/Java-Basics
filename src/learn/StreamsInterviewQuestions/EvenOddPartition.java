package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartition {
	
	public static void main(String[] args) {
		
		List <Integer> list = Arrays.asList(123,435,213,56,63);
		
	Map<Boolean, List<Integer>> result=
				list.stream().collect(Collectors.partitioningBy(n-> n%2 ==0));
	
	System.out.println("Even Numbers: "+result.get(true));
	
	System.out.println("Odd Numbers"+result.get(false));
	
	// OR
	
	int[] arr = {1,2,3,4,5,6,7,8,9};
	
	List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
	List<List<Integer>> EvenOddNo = list1.stream()
				.collect(Collectors.partitioningBy(x-> x%2==0, Collectors.toList()))
				.entrySet().stream()
				.map(x -> x.getValue())
				.collect(Collectors.toList());
	
	System.out.println(EvenOddNo);
	
	}

}
