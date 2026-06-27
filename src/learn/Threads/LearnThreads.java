package learn.Threads;

class Counter {
	
	int count  = 0;
	
	public void increament() {
		count++;
	}
}



public class LearnThreads {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		Runnable a = () -> {
			
				
				for(int i =0; i<=1000;i++) {
				
				c.increament();
				}
				
				
			
		};
		
		
		Runnable b = () -> {
			
			
				for(int i =0; i<=1000;i++) {
					c.increament();
					}
		};
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		
	
		t1.start();
		t2.start();
		
		System.out.println(c.count);
	}

}
