package learn.InnerClass;


class A{
	
	public void show() {
		System.out.println("In show");
		
	}
	
	class B{
		
		void print() {
			
			System.out.println("In print");
		}
	}
}

public class LearnInnerClass {

	public static void main(String[] args) {
		
		A a = new A();
		a.show();
		
		A.B b =  a.new B();
		b.print();
		
	}
}
