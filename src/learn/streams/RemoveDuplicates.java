package learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,3,6,3,1);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("List: "+list);
		System.out.println("Unique List: "+unique);
	}
	
}
