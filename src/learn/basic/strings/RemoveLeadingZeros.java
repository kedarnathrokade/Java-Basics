package learn.basic.strings;

public class RemoveLeadingZeros {

	
	public static String RemoveZero(String str) {
		
		int i = 0;
		
		while(i < str.length() && str.charAt(i) == '0') 
			
			i++;
			
			StringBuffer sb = new StringBuffer(str);
			
			sb.replace(0, i, "");
			
			return sb.toString();
			
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "00001342";
		
		System.out.println("Original String : "+ str);
		
		str = RemoveZero(str);
		
		System.out.println("After removing of leading zeros: "+str);
	}
}
