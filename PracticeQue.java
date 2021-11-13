package week3.day1;

import java.util.Iterator;

public class PracticeQue {

	public static void main(String[] args) {
		// passing value of string as arguments in a constructor so, output is Diff Text
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
//		String str3 = "Kutty";
//		String str4 = "Kutty";
		if (str3 == (str4)) {
			System.out.println(" Same text");
		} else
			System.out.println("Diff text");

		System.out.println("***");

		// get character function
		String text = "Java Exercise";
		int ch = text.indexOf('E');
		int ch2 = text.indexOf('s');
		System.out.println("Index of E: " + ch);
		System.out.println("Index of s: " + ch2);
		
		System.out.println("***");

		// equalsignorecase
		System.out.println("Using equalsignorecase");
		String st1 = "I am Learning Java?";
		String st2 = "I am learning java?";
		if (st1.equalsIgnoreCase(st2)) {
			System.out.println(" Strings are equal");
		} else {
			System.out.println(" Strings are different");
		}
		System.out.println("Using equals");
		if (st1.equals(st2)) {
			System.out.println(" Strings are equal");
		} else {
			System.out.println(" Strings are different");
		}
		
		System.out.println("***");
		
		//replace  - replace 8 to 1, Print the characters from 5 to 14
		String sentence = "I am working with Java8";
		int length=sentence.length();
		System.out.println("The length of the given string is : "+length);
		String replace=sentence.replace('8', '1');
		String replaceSt=replace;
		String str="#";
		String ConcatSt=replaceSt.concat(str);
		String subSt=sentence.substring(5, 14);
		System.out.println("Replaced sentence is: "+replaceSt);
		System.out.println("Concatinated sentence is: "+ConcatSt);
		System.out.println("After replace and sub string from the given sentece is: "+subSt);		
		System.out.println("***");
	}

}
