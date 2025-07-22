package learn.basic.strings;

import java.io.*;
import java.util.Scanner;


public class ReverseString {

	
	public static void main(String[] args) {
		
		String s= "Samarth"; 
		
		String rev = ""; // this variable stores reverse string 
		char ch;		// used to store the each charater by charater 
		
		for(int i =0; i<s.length(); i++) {
				
			ch = s.charAt(i);
			
			rev = ch + rev;
			
			
		}
		
		System.out.println("Original string : "+ s);
		
		System.out.println("Reversed string : "+ rev);
	}
}
