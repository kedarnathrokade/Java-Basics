package learn.basic.EnnovateSolutions;



public class printwithoutloop {
	
	static int i=1;
	
	public static void main(String args[]) {
		
		printwithoutloop p = new printwithoutloop();
		
		
		p.print();
		
		
	}
	
	void print()
	{
		
		if(i<=100) {
			System.out.println(i);
			i++;
			print();
			}
	}
			
}
	
	