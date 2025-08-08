package learn.strings;

import java.util.ArrayList;

public class SubstringInString {
	
	public static ArrayList<String> SplitString(String str){
		
		int i, j;
		
		int stringlen = str.length();
		
		ArrayList<String> subStringList = new ArrayList<String>();
		
		for(i =0; i<stringlen; i++) {
			
			for(j=i+1;j <= stringlen;j++) {
				
				subStringList.add(str.substring(i, j));
				
			}
		}
		
		return subStringList;
	}

	
	
	public static void main(String[] args) {
		
		String str = "This is Gold";
		
		System.out.println("The Original String : "+ str);
		
		ArrayList<String> substring = SubstringInString.SplitString(str);
		
		System.out.println("Substrings: ");
		
		System.out.println(substring);
	}
}
