/**
 * @author gaurnitai
 * @created_date Feb 4, 2018
 */

package com.javabasics.array;

import java.util.Arrays;

public class ArrayAdvanced {

	String s = "What is your name your is What";
	// String s = "What is ur name your is What";
	int j = 0;

	public void palimdromeFind() {
		// So far we have seen normal ways to find the palimdrome
		// lets try some advanced function of Arrays to achieve the same
		// 1. Convert string into array
		String s1[] = s.split(" ");
		System.out.println(s1.length);
		System.out.println("The first array is " + s1);
		String s2[] = new String[s1.length];

		for (int i = s1.length - 1; i >= 0; i--) {
			s2[j] = s1[i];
			j++;

		}
		System.out.println("The second array is " + s2.length);
		// Now we have two arrays
		// lets use equals() method of Array
		boolean isTrue = Arrays.equals(s1, s2);
		if (isTrue) {
			System.out.println("Given String is a palindrome");
		} else {
			System.out.println("Given String is not a palindrome");
		}

	}

	public void palindromeFind2() {
		String s1[] = s.split(" ");
		System.out.println(s1.length);
		System.out.println("The first array is " + s1);
		String s2[] = new String[s1.length];

		for (int i = s1.length - 1; i >= 0; i--) {

			/*
			 * if(i==s1.length) { break; // This block of code is not required other wise
			 * there will be IndexBeyondException }
			 */

			s2[(s1.length - 1) - i] = s1[i];

		}
		System.out.println(s2.length);
		if (Arrays.equals(s1, s2)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}

	}

	public void palindromeFind3() {

		String s = "madam";
		String s1[] = s.split("");
		String ss = Arrays.toString(s1).substring(1, Arrays.toString(s1).length() - 1);
		System.out.println("The substring is " + ss);

		StringBuilder sb = new StringBuilder(ss);

		System.out.println(sb);
		sb.reverse();
		System.out.println("After reverse: " + sb.reverse());

		if (s.equals((sb.reverse().toString()))) {
			System.out.println("Its a palindrome");

		} else {
			System.out.println("Its not a palindrome");
		}

	}
	
	
	public void palindromeFind4() {

		String s = "madaam";
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder(sb1.reverse());
		
		if(s.equals(String.valueOf(sb2))) {
			System.out.println("Its a palindrome");
		}

	}

	public static void main(String[] args) {

		ArrayAdvanced aa = new ArrayAdvanced();
		aa.palimdromeFind();
		aa.palindromeFind2();
		//aa.palindromeFind3();
		aa.palindromeFind4();

	}

}
