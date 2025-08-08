package learn.strings;

public class UpdateCharaterInString {
	
	public static void main(String[] args) {
		
		String s = "THis is java";
		
		int index= 1;
		
		char ch = 'h';
		
		System.out.println("Original String is : "+s);
		
		s= s.substring(0,index)+ ch + s.substring(index+1);
		
		System.out.println("After updating element : "+s);
	}

}
