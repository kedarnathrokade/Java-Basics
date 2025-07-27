package learn.basic.printnowithoutloop;

public class PrintNumbers {
	
	public static void main(String[] args) {
		int number=1;
		
		 print(number);
	}
	
	public static int print(int no) {
		
		if(no<=100)
		{
			System.out.println(no);
			return print(no+1);
			
		}
		
		else {
			
			return 0;
		}
		
	}

}
