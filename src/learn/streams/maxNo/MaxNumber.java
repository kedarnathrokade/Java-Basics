package learn.streams.maxNo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
	

public static void main(String args[]){

List<Integer> list = Arrays.asList(1,2,2234,43,5);

Optional<Integer> cal = list.stream().max(Integer::compare);

Integer max = cal.get();

System.out.println("Maximum number is : "+max);

}

}
