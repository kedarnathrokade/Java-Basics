package learn.Enum;

enum Status{
	
	Running, Failed, Started, Stop;	
}
public class LearnEnum {

	public static void main(String[] args) {
		
		Status s = Status.Running;
		System.out.println(s);
		
		Status ss[] = Status.values();  
		
		for(Status s1 : ss) {
			
			System.out.println(s1+ " : "+s1.ordinal());
		}
		
	}
}
