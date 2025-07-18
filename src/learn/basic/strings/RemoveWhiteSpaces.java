package learn.basic.strings;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String s1 = "K ed ar nath";
		
		String result = s1.replaceAll("\\s+", "");
		
		System.out.println("Original String : " +s1);
		
		System.out.println("Result  String : " +result);
		
		
	}

}
