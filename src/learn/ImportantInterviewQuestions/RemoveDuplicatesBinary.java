package learn.ImportantInterviewQuestions;

public class RemoveDuplicatesBinary {
	
	public static void main(String ar[]){


		String input = "Programming";

		boolean visited[] = new boolean[256];
		
		StringBuffer result = new StringBuffer();

		for(int i =0; i<input.length(); i++){

			char ch = input.charAt(i);
			
			if(!visited[ch]){
			
			visited[ch] = true;
			result.append(ch);
		}

		}

		System.out.println("Original String: "+ input);
		System.out.println("After removing elements: "+ result);
		}

}
