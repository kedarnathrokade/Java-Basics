package learn.basic.LearnHashmap;

import java.util.HashMap;

public class LearnHashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> m = new HashMap<>();
		
		m.put("1","kedar");
		m.put("2","sourabh");
		m.put("3","ashish");
		m.put("4","vaibhav");
		m.put("5","Ram");
		
		
		
		System.out.println(m.get("5"));
		System.out.println(m.containsKey("4"));
		System.out.println(m.entrySet());
		
		
		
	}

}
