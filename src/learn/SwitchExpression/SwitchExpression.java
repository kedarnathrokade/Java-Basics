package learn.SwitchExpression;

public class SwitchExpression {
	
	public static void main(String[] args) {
		
		String day = "Sunday";
		String result = "";
		
	 result = switch(day){
		
		case "Monday", "Tuesday" -> "6AM";
		case "Sunday" -> "7AM";
		default -> "6:30AM";
			
			
		};
		
		System.out.println(result);
		
	}
	
	

}
