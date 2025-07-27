package learn.basic.LearnLinkedList;

import java.util.LinkedList;

public class LearnLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> car = new LinkedList<>();
		car.addFirst("BMW");
		car.addFirst("Volkswegen");
		car.addFirst("Fortuner");
		car.addLast("swift");
		
		
		System.out.println(car);
		
		System.out.println(car.getFirst());
		System.out.println(car.getLast());
		System.out.println(car.removeFirst());
		System.out.println(car.removeLast());
		System.out.println(car);
		
	}

}
