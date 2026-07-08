package learn.StreamsInterviewQuestions;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseOfStreams {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5);
		
		Supplier<Stream<Integer>> stream = () -> list.stream(); // Everytime it creates new stream
		stream.get().forEach(System.out::println); // terminal operation
		
		long count = stream.get().count(); // terminal operation
		System.out.println("count: "+count);
	}

}
