package learn.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Apple","Banana", "Dates","Grapes", "Pineapple");
		
		Optional<String> longstring = list.stream()
				.max(Comparator.comparingInt(String::length));
		
		System.out.println("Longest String is : "+ longstring);
		
		
	}
}
