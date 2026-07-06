package learn.StreamsInterviewQuestions;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveNonNumericChars {

	public static void main(String[] args) {
		List<String> list = List.of("1a2b3c", "a1b2c3", "123abc");
		
		Pattern pattern = Pattern.compile("[^0-9]");
		
		List<String> result = list.stream().map(x -> pattern.matcher(x).replaceAll(""))
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
