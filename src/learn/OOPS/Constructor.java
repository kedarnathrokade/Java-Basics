package learn.OOPS;

public class Constructor {

	public static void main(String[] args) {
		
		Complex  c1 = new Complex(3,2);
		Complex  c2 = new Complex(13,2);
		Complex  c3 = new Complex(10);
		c1.print();
		c2.print();
		c3.print();
	}
}


class Complex{
	
	int a, b;
	
/*	public Complex() {  
		
		a=0; // This is default constructor
		b=0;
	}
	*/  
public Complex(int real) {
		
		a = real;
		b = 40;
		
	}
	
	public Complex(int real, int imaginary) {
		
		a = real;
		b = imaginary;
		
	}
	
	
	void print() {
		
		System.out.println(a+"+"+b+"i");
	}
	
}