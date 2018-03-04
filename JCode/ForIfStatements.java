/**
 * @author gaurnitai
 * @created_date Jan 21, 2018
 */

package com.javabasics.loopstatements;

public class ForIfStatements {

	// lets consider x = 7 and we have to make sure whether its a prime
	// number or not
	public static void prime(int a) {
		int x = a;
		boolean xy = false;
		for (int i = 2; i < x; i++) {
			if (i % x == 0) {
				xy = true;
				break;
			}
			if (i == x) {
				System.out.println(x);
			}

		}

		if (!xy) {
			System.out.println(x);
		}

	}

	public static void prime2(int a) { // 3
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				break;
			}
			if (a == i+1) {
				System.out.println(a);
			}

		}
		//System.out.println(a);
	}
	
	public static void prime3(int a) { // 3
		for (int i = 2; i <=a; i++) {
			
			if (a == i) {
				System.out.println(a);
			}
			
			if (a % i == 0) {
				break;
			}
			

		}
		//System.out.println(a);
	}

	public static void main(String args[]) {
		prime(13);
		prime(15);
		prime(19);
		prime(12);

		prime2(13);
		prime2(15);
		prime2(19);
		prime2(12);

	}

}
