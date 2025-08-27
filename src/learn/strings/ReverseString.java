package learn.strings;



public class ReverseString {

	
	public static void main(String[] args) {
		
		String s= "Samarth"; 
		
		String rev = ""; // this variable stores reverse string 
		char ch;		// used to store the each charater by charater 
		
		for(int i =s.length()-1; i>=0; i--) {
				
			ch = s.charAt(i);
			
			rev = rev + ch;
			
			
		}
		
		System.out.println("Original string : "+ s);
		
		System.out.println("Reversed string : "+ rev);
	}
}
