package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AccendingDecendingOrderElements {
	
	public static void main(String[] args) {
		
		// Using List
		List<Integer> list = Arrays.asList(20,50,1,3,6,100);
		System.out.println("Accending Order using List: ");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Decending Order using list: ");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		// Using Array
		int[] arr = { 20,50,1,3,6,100};
		System.out.println("Accending Order using Array: ");
		Arrays.stream(arr).sorted().forEach(System.out::println);
		System.out.println("Decending Order using Array: ");
		Arrays.stream(arr).mapToObj(n -> n)
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
	}

}
