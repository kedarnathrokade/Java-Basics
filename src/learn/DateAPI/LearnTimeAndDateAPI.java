package learn.DateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LearnTimeAndDateAPI {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		LocalDateTime ld = LocalDateTime.now();
		
		System.out.println("System current date: " +d);
		System.out.println("System current date and Time: " +ld);
	}
	
}
