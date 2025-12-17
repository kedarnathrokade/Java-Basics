package learn.streams;

import java.util.Arrays;
import java.util.List;

public class StartsWithFirstDigit {
	
	
		public static void main(String args[]){

			List<Integer> list = Arrays.asList(1,2,11,112,220,32,331);

			list.stream().map(String::valueOf).filter(s -> s.startsWith("1")).forEach(System.out::println);


	}	
}
