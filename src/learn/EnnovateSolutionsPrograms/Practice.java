package learn.EnnovateSolutionsPrograms;

class A{
	
	public void show() {
		
		System.out.println("Inside show A");
	}
}

class B extends A{
//	
//public void show() {
//	
//		System.out.println("Show inside  B");
//	}
//	
	
	
}

class C extends B{
	public void show() {
		
		System.out.println("Show inside  C");
	}
	
	
}
public class Practice {
	
	public static void main(String args[]) {
		
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		C c =new C();
		c.show();
}
}