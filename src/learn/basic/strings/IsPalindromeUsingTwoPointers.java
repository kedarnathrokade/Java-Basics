package learn.basic.strings;

public class IsPalindromeUsingTwoPointers {
	
	public static boolean isPalindrome(String s) {
		
		int i=0, j= s.length() -1;
		
		while (i<j) {
			
			if(s.charAt(i) != s.charAt(j)) {
				
				return false;
			}
				i++;
				j--;
			}
				
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Racer";
		String s2 = "MOM";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		boolean res1 = isPalindrome(s1);
		boolean res2 = isPalindrome(s2);
		
		if(res1) {
			System.out.println(s1+" is Palindrome");
		}
		
		else 
			System.out.println(s1+" is not palindrome");
		
		if(res2) {
			System.out.println(s2+" is Palindrome");
		}
		
		else 
			System.out.println(s2+" is not palindrome");
		
	}

}
