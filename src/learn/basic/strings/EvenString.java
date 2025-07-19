package learn.basic.strings;

public class EvenString {

	
		public static void main(String[] args) {
			String s1= "Welcome to India";
			
			for (String result : s1.split(" ")){
				
				if (result.length() % 2 ==0) {
					
					System.out.println(result);
				}
			}
		}
}
