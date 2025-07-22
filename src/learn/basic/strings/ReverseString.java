package learn.basic.strings;

import java.io.*;
import java.util.Scanner;


public class ReverseString {

	
	public static void main(String[] args) {
		
		String s= "Samarth";
		
		String rev = "";
		char ch;
		
		for(int i =0; i<s.length(); i++) {
				
			ch = s.charAt(i);
			
			rev = ch + rev;
			
			
		}
		
		System.out.println("Original string : "+ s);
		
		System.out.println("Reversed string : "+ rev);
	}
}
