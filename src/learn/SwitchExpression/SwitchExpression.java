package learn.SwitchExpression;

public class SwitchExpression {
	
	public static void main(String[] args) {
		
		String day = "Sunday";
		String result = "";
		
	 result = switch(day){
		
		case "Monday", "Tuesday": yield "6AM";
		case "Sunday" : yield "7AM";
		default : yield "6:30AM";
			
			
		};
		
		System.out.println(result);
		
	}
	
	

}
