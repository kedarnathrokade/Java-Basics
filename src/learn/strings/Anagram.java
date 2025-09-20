package learn.strings;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String str1 = "race";
		String str2 = "care";
		
		if(isAnagram(str1, str2)) {
			
			System.out.println(str1+""+" and "+str2 + " are anagrams");		
			
		}
		
		else {
			
			System.out.println(str1+""+" and "+str2 + " are not anagrams");		
		}
		
		
	}

	private static boolean isAnagram(String str1, String str2) {
		
		str1.replaceAll("\\s", "");
		str2.replaceAll("\\s", "");
		
		if(str1.length() != str2.length())
		{
			return false;
			
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
	}

}
