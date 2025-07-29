package learn.basic.strings;

public class StringtoStringArray {
	
	public static void main(String[] args) {
		
		
		String str = "This program is converting String to String Array";
		
	String strarray[] = str.split(" ");
	
	System.out.println("String is : "+ str);
	
	System.out.print("String array is : [ ");
	
	for (int i = 0; i<strarray.length;i++) {
		
		System.out.print(strarray[i]+", ");
		
	}
	
	System.out.println("],");
	
	}

}


