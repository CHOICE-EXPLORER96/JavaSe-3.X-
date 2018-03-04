/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

public class IfElseMultiwayNested {

	static int largest;
	// lets try findng the greatest number from n1 and n2

	public static void ifElseMultiway1(int n1, int n2, int n3) {

		if (n1 > n2) {
			if (n1 > n3) {
				largest = n1;
				System.out.println("n1 is greatest " + largest);
			} else {
				largest = n3;
				System.out.println("n3 is greatest " + largest);
			}
		} else {
			if (n1 > n3) {
				if (n3 > n2) {
					largest = n3;
					System.out.println("n3 is greatest " + largest);
				} else {
					largest = n2;
					System.out.println("n2 is greatest " + largest);
				}
			} else {
				if (n2 > n3) {
					largest = n2;
					System.out.println("n2 is greatest " + largest);
				} else {
					largest = n3;
					System.out.println("n3 is greatest " + largest);
				}
			}
		}

	}

	// Above programs can be written in a simple way

	public static void ifElseMultiway2(int n1, int n2, int n3) {

		if (n1 > n2) {
			if (n1 > n3) {
				largest = n1;
				System.out.println("n1 is greatest " + largest);
			} else {
				largest = n3;
				System.out.println("n3 is greatest " + largest);
			}
		} else {
			{
				if (n2 > n3) {
					largest = n2;
					System.out.println("n2 is greatest " + largest);
				} else {
					largest = n3;
					System.out.println("n3 is greatest " + largest);
				}
			}
		}

	}

	public static void ifElseMultiway4(int n1, int n2, int n3) {

		if (n2 > n3) {
			if (n2 > n1) {
				largest = n2;
				System.out.println("n2 is greatest " + largest);
			} else {
				largest = n1;
				System.out.println("n1 is greatest " + largest);
			}
		} else {
			{
				if (n1 > n3) {
					largest = n1;
					System.out.println("n1 is greatest " + largest);
				} else {
					largest = n3;
					System.out.println("n3 is greatest " + largest);
				}
			}
		}

	}

	// what do you think this logic is correct or wrong

	public static void ifElseMultiway3(int n1, int n2, int n3) {

		if (n1 > n2) { // 10,12,11
			if (n1 > n3) {
				largest = n1;
				System.out.println("n1 is greatest " + largest);
			} else {
				largest = n3;
				System.out.println("n3 is greatest " + largest);
			}
		} else {
			if (n1 > n3) {
				if (n3 > n2) {
					largest = n3;
					System.out.println("n3 is greatest " + largest);
				} else {
					largest = n2;
					System.out.println("n2 is greatest " + largest);
				}
			} else {

				largest = n3;
				System.out.println("n3 is greatest " + largest);

			}
		}

	}

	public static void main(String[] args) {
		ifElseMultiway1(10, 12, 11);
		ifElseMultiway1(15, 12, 11);
		ifElseMultiway1(10, 12, 34);
		System.out.println("/n");
		System.out.println("\n");
		ifElseMultiway2(10, 12, 11);
		ifElseMultiway2(15, 12, 11);
		ifElseMultiway2(10, 12, 34);

		System.out.println("\n");
		ifElseMultiway3(10, 12, 11); // this one giving wrong logic
		ifElseMultiway3(15, 12, 11);
		ifElseMultiway3(10, 12, 34);

		System.out.println("\n");
		ifElseMultiway4(10, 12, 11);
		ifElseMultiway4(15, 12, 11);
		ifElseMultiway4(10, 12, 34);

		System.out.println("\n");
		ifElseMultiway4(12, 12, 11);
		ifElseMultiway4(15, 12, 11);
		ifElseMultiway4(10, 78, 27);

	}

}
