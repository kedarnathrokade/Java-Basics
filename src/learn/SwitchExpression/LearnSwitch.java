package learn.SwitchExpression;

public class LearnSwitch {
	
	public static void main(String[] args) {
		
		String day = "Monday";
		
		
		switch(day) {   // Tradition Switch Case 
		
		case "Monday", "Friday" : 
				System.out.println("6 AM");
				break;
		case "Sunday":
				System.out.println("8 AM");
				break;
				
		default: 
				System.out.println("7 AM");
				break;
		
		
		
		
		}
	}

}
