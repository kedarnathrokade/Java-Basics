package learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestSal {
	
	public static void main(String[] args) {
		
		List<Integer> sal = Arrays.asList(1,2,3,4,5);
		
	Optional<Integer> optional =sal.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();
		
	Integer secondhighest = optional.get();
	
	System.out.println(secondhighest);
	
	}

}
