package learn.EnnovateSolutionsPrograms;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class trying {
	



	public static void main(String args[]){

		String str = "programming";

		String result = str.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedHashSet::new)).stream().map(String::valueOf).collect(Collectors.joining());

		System.out.println("Original String: "+str);

		System.out.println("Removed Duplicates: "+result);


		}





		}






