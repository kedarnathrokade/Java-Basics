package learn.Enum;

enum Status1{
	
	Running, Failed, Pending, Success;
}
public class ConditionsEnum {
	
	public static void main(String[] args) {
		
		Status1 s = Status1.Pending;
		
		
		switch(s) {
		
		case Running: 
			System.out.println("Running fine");
			break;
		case Failed: 
			System.out.println("Try Again");
			break;
			
		case Pending: 
			System.out.println("Please wait");
			break;
		default: 
			System.out.println("Done");
		}
		
		
		
		if(s == Status1.Running) {
			System.out.println("Running fine");
		}
		else if (s == Status1.Failed) {
			System.out.println("Failed, Try again!");
		}
		else if(s == Status1.Pending) {
			System.out.println("Please wait");
		}
		else {
			System.out.println("Success");
		}
	}

}
