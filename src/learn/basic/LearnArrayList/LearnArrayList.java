package learn.basic.LearnArrayList;
import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		
		System.out.println(array);
		System.out.println(array.contains(10));
		
	}
}
