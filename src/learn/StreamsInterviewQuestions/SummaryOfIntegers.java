package learn.StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryOfIntegers {
	
	public static void main(String[] args) {
		
	
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics stats = numbers.stream().
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Count   : " + stats.getCount());
        System.out.println("Sum     : " + stats.getSum());
        System.out.println("Min     : " + stats.getMin());
        System.out.println("Max     : " + stats.getMax());
        System.out.println("Average : " + stats.getAverage());
        
	}

}
