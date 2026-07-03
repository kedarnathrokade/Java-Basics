package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByRange {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,10,20,30,43,56,59,63,67};
        
		List<Integer> list = Arrays.stream(arr).boxed()
		                    .collect(Collectors.toList());
		                    
        Map<Integer, List<Integer>> mapListing = 
                list.stream().
                collect(Collectors.groupingBy(x -> x/10*10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(mapListing);
                            
	}

}
