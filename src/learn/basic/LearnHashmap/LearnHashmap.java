package learn.basic.LearnHashmap;

import java.util.HashMap;

public class LearnHashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> m = new HashMap<>();
		
		m.put("1","kedar");		// put() method is used to add the element in hashmap
		m.put("2","sourabh");
		m.put("3","ashish");
		m.put("4","vaibhav");
		m.put("5","Ram");
		
		
		
		System.out.println(m.get("5")); // get() method is used to retrieve the data 
		System.out.println(m.containsKey("4"));  // containsKey() method will check whether element is exist or not. If exist it returns true else return false
		System.out.println(m.entrySet());		// entrySet() method is used to retrieve all the elements in hashamap object.
		System.out.println(m.remove("3"));  	// remove() method is used to remove the element
		System.out.println(m.entrySet());
		System.out.println(m.hashCode());
		
	}

}
