package learn.basic.strings;


public class StringReverseUsingStringBuffer {
	
	public static void main(String args[]) {
		
		String s= "India";
		
		StringBuffer revstring = new  StringBuffer(s);
		
		revstring.reverse();
		
		System.out.println("Original String : "+ s);
		System.out.println("Reversed String; "+ revstring);
		
	}

}
