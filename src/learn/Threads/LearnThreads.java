package learn.Threads;


//class A implements Runnable{
//	
//	public void run() {
//		
//		for(int i =0; i<=5;i++) {
//		
//		System.out.println("Hi");
//		}
//		
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}


//class B implements Runnable{
//	
//	public void run() {
//		for(int i =0; i<=5;i++) {
//		System.out.println("Hello");  }
//		
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//			
//	}
//	
//}
public class LearnThreads {
	
	public static void main(String[] args) {
		
		Runnable a =  new Runnable()  {
			public void run() {
				
				for(int i =0; i<=5;i++) {
				
				System.out.println("Hi");
				}
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		};
		Runnable b = new Runnable() {

			public void run() {
				for(int i =0; i<=5;i++) {
				System.out.println("Hello");  }
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					
			}
			
			
		};
		
		Thread t1 = new Thread(a);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread t2 = new Thread(b);
		
		
	
		t1.start();
		t2.start();
	}

}
