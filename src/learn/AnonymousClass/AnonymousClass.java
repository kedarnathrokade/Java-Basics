package learn.AnonymousClass;

class A{
	
	void show() {
		
		System.out.println("In A show");
	}

}

//class B extends A{
//	
//	void show() {    // If this is used only one time the use anonymous class
//		
//		System.out.println("In B show");
//	}
//}



public class AnonymousClass {
	
	public static void main(String[] args) {
		
		A a =new A() {
			
			void show() {
				System.out.println("In new show");
			}
		};
	a.show();
}

}
