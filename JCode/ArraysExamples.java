/**
 * @author gaurnitai
 * @created_date Feb 4, 2018
 */

package com.javabasics.array;

import java.util.Stack;

public class ArraysExamples {
	int x = 0;
	int y;
	boolean isBreak = false;

	int[] arr1 = { 1, 2, 3, 2, 3, 2 };

	int[] arr2 = { 1, 2, 3, 2, 3, 2 };

	String s = "madaam";

	public void arrayFunctions() {

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == arr2[i]) {

				if (i == arr1.length - 1) {

					System.out.println("Its a palindrome");
				}

				continue;

			} else {

				System.out.println("Its not a palindrome");
				break;
			}

		}

	}

	public void palidromeFind() {

		for (int i = 0; i < arr1.length; i++) {

			// int x =0;
			for (int j = x; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					// x++;
					if (j == arr2.length - 1) {
						System.out.println("Its a palindrome");
					}
					break;
				} else {
					System.out.println("Its not a palindrome");
					isBreak = true; // to break out of outer loop
					break;
				}
			}
			x = x + 1;
			if (isBreak) {
				break;
			}

		}

	}

	public void palindromeWithStack() {

		// there is a stack Class which we can also use to achieve the palindrome

		// String s1[] = s.split("[a-zA-Z]+"); //not sure why its not working though
		// regex is correct

		// System.out.println(s1.length);

		String s2[] = s.split("");

		System.out.println(s2.length);

		Stack st = new Stack();
		for (String ss : s2) {

			st.push(ss);
		}

		for (String ss2 : s2) {

			if (ss2.equals(st.pop())) {
				continue;
			} else {
				System.out.println("Its not a palindrome");
				break;
			}
		}

		if (st.isEmpty()) {
			System.out.println("Its a palindrome");
		}

	}

	public void palindromeUsingStack() { // Not working some logic issue.. in case you interested try debugging
		// and find the incorrect logic...just try that

		Stack<Integer> s = new Stack<Integer>();
		for (int i : arr1) {
			s.push(i);
		}

		//for (int ia2 : arr2) {
		y = arr2.length-1;
			 for (int j = y; j < arr2.length; j--) {

			// Integer io = s.get(j);
			System.out.println(s.pop());
			
			if (arr2[j] == s.pop().intValue()) {

				continue;
			} else {
				System.out.println("Its not a palindrome");
				break;
			}

		}

		if (s.isEmpty()) {
			System.out.println("This is a palindrome");
		}
		//System.out.println(s.get(0));

	}
	
	
	

	public static void main(String args[]) {
		ArraysExamples ae = new ArraysExamples();
		ae.arrayFunctions();

		//ae.palindromeUsingStack(); // this is having some issues ..you guys can try
		// debugging and find the issue

		ae.palidromeFind();

		ae.palindromeWithStack();

	}

}
