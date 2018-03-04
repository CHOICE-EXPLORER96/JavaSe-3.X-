/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

public class IfElseMultiway {

	/*
	 * Lets take an example - we have to print only those numbers which are
	 * divisible by 2 out of two numbers
	 */
	public void multiwayIfElseExamplesNums(int n1, int n2) {
		if (n1 % 2 == 0) {
			if (n2 % 2 == 0) {
				System.out.println(n1 + " and " + n2 + " are divisble by 2 and even");
			} else {
				System.out.println(n1 + " is divisible by 2 and even");
			}
		} else {
			if (n2 % 2 == 0) {
				System.out.println(n2 + " is divisible by 2 and even");
			} else {
				System.out.println(n1 + " and " + n2 + " are not divisble by 2 and odd");
			}
		}
	}

	// Lets take another example- we have to find if the given two nos are divisible
	// by 4
	public void ifElseOddEvenNums(int n1, int n2) {
		Integer on1 = n1; // converting primitive to object
		String sn1 = on1.toString(); // converting object to String
		String ssn1 = sn1.substring(sn1.length() - 2); // to get last 2 digits

		Integer on2 = n2; // converting primitive to object
		String sn2 = on2.toString();// converting object to String
		String ssn2 = sn2.substring(sn2.length() - 2); // to get last 2 digits

		int in1 = Integer.parseInt(ssn1);
		int in2 = Integer.parseInt(ssn2);

		if (in1 % 4 == 0) {
			if (in2 % 4 == 0) {
				System.out.println(n1 + " and " + n2 + " are divisble by 4");
			} else {
				System.out.println(n1 + " is divisible by 4");
			}
		} else {
			if (in2 % 4 == 0) {
				System.out.println(n2 + " is divisible by 4");
			} else {
				System.out.println(n1 + " and " + n2 + " are not divisble by 4");
			}

		}

	}

	public static void main(String[] args) {
		IfElseMultiway io = new IfElseMultiway();
		io.ifElseOddEvenNums(24, 25);
		io.multiwayIfElseExamplesNums(24, 25);
		
		io.ifElseOddEvenNums(24356, 2567803);
		io.multiwayIfElseExamplesNums(24356764, 25786553);

		io.ifElseOddEvenNums(24355, 25678036);
		io.multiwayIfElseExamplesNums(24356763, 25786556);
		
		io.ifElseOddEvenNums(24353, 24355);
		io.multiwayIfElseExamplesNums(25786556, 25786556);
		
		
	}

}
