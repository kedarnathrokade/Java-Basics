package learn.StreamsInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToLeft {
	
	public static void main(String[] args) {
		int[] arr = {5,0,3,0,7,0,5};
		
		// Method 1 : Using Stream.concat() method
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); // converted int[] to Arraylist
		
		List<Integer> result = Stream.concat(list.stream().filter(x -> x==0), list.stream().filter(x -> x!=0))
				.collect(Collectors.toList());
		System.out.println("Using Stream.concat() method : "+result);
		
		// Method 2 : Add zeros one arraylist and add non zeros to another arraylist then add both
		
		List<Integer> zeros = list.stream().filter(n -> n==0).collect(Collectors.toList());
		List<Integer> nonZeros = list.stream().filter(n ->n!=0).collect(Collectors.toList());
		
		List<Integer> ans = new ArrayList<>();
		ans.addAll(zeros);
		ans.addAll(nonZeros);
		System.out.println("Using method 2 : "+ans);
		
		// Method 3 : Using partitioningBy and flatMap
		
		 List<Integer> result1 = list.stream()
				.collect(Collectors.partitioningBy(x -> x!=0)).values()
				.stream().flatMap(x -> x.stream()).toList();
		
		System.out.println("Using PartitioningBy : "+result1);
		
	}

}
