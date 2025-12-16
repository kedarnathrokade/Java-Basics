package learn.streams.uniqueNumbers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElementsUsingLinkedHashSet {
	

public static void main(String args[]){

List<Integer> list = Arrays.asList(1,2,4,1,2,4);

System.out.println("Unique elements using LinkedHashSet: "+list.stream().collect(Collectors.toCollection(LinkedHashSet::new)));


}
}