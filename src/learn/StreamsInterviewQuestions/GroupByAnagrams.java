package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByAnagrams {
	
	public static void main(String[] args) {
		
		 String[] s= {"pat", "tap", "nap", "pan", "Team", "meat", "tree"};
		 
		 Collection< List<String>> ans = Arrays.stream(s)
		 .collect(Collectors.groupingBy(x -> 
		 Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
		 
		 System.out.println(ans);
		 
	}

	
}
