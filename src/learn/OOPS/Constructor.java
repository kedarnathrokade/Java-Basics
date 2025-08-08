package learn.OOPS;

public class Constructor {

	public static void main(String[] args) {
		
		Complex  c1 = new Complex(3,2);
		
		c1.print();
		
		
	}
}


class Complex{
	
	int a, b;
	
/*	public Complex() {  
		
		a=0; // This is default constructor
		b=0;
	}
	*/  
	
	public Complex(int real, int imaginary) {
		
		a = real;
		b = imaginary;
		
	}
	
	void print() {
		
		System.out.println(a+"+"+b+"i");
	}
	
}