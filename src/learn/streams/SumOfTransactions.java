package learn.streams;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfTransactions {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = Arrays.asList(
				
				new Transaction("2025-08-29", 100),
				new Transaction("2025-08-29", 200),
				new Transaction("2025-08-29", 500),
				new Transaction("2025-08-28", 300),
				new Transaction("2025-08-28", 100),
				new Transaction("2025-08-27", 700),
				new Transaction("2025-08-27", 300)
				
				);
		
		Map<String, Integer> AddbyDate = transactions.stream()
													 .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
		
		
		transactions.forEach(t -> System.out.println("Date :"+t.getDate() + "Amount: "+t.getAmount()));
		
		System.out.println("Sum of Transaction: "+ AddbyDate);
	}

}

class Transaction{
	
	private String date;
	private int Amount;
	
	public Transaction(String string, int amount) {
		
		this.date = string;
		this.Amount=amount;
	}
	public String getDate() {
		
		return date;
	}
	
	public int getAmount() {
		
		return Amount;
	}
}
