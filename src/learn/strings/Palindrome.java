package learn.strings;

public class Palindrome {
	
	private static boolean checkPalidrome(String s) {
		
		String s1= s.toLowerCase();
		
		String rev = "";
		for(int i = s1.length()-1; i>=0; i--) {
			
			rev= rev + s1.charAt(i);
			
		}
		
		return s1.equals(rev);
	}
	
	public static void main(String[] args) {
		
		String s1="abba";
		
		boolean res = checkPalidrome(s1);
		
		
		if(res) {
			System.out.println("Given string is palindrome : "+ s1);
		}
		else
			System.out.println("Given string is not pelindrome");
		
		
		
	}

}
