/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

public class IfElseExamples {
	/*
	 * // if statement is a single way statement and will execute only if the
	 * condition is valid or we can say true
	 * In case of 'if' statement if the condition is false the 'if' block will get skip
	 */
	/*
	 * // if - else statement is two way statement in java. // In case of if - else
	 * statement there will be alternate path of exexcution // for program in acse
	 * the condition is invalid or not true // In If-Else statement, if condition id
	 * true 'if' block will execute and // if condition is false then 'else' block
	 * will execute // So two way statement will always execute even though
	 * condition false or true
	 */

	// Lets take an example - we have to subtract n1 and n2 only if n1 is greater
	// than n2
	public void ifExamples(int n1, int n2) {
		if (n1 > n2) {
			int sub = n1 - n2;
			System.out.println("n1 is greater than n2 and result is : " + sub);
		}
	}
	

	/*
	 * Lets take an example - we have to subtract n1 and n2 only if n1 is greater
	 * than n2 otherwise subtract n2 and n1
	 */
	public void ifElseExamples(int n1, int n2) {
		if (n1 > n2) {
			int sub = n1 - n2;
			System.out.println("n1 is greater than n2 and result is : " + sub);
		} else {
			int sub = n2 - n1;
			System.out.println("n1 is not greater than n2 and result is : " + sub);
		}
	}
	
	// above example using ternary operator
		public void ternaryOperator(int n1, int n2) {
			int res = (n1>n2)? n1-n2 : n2-n1 ;
			System.out.println(res);
			
		}

	/*
	 * Lets take an example - we have to print only those numbers which are
	 * divisible by 2
	 */
	public void ifExamplesNum(int n1) {
		if (n1 % 2 == 0) {
			System.out.println(n1 + " is divisble by 2");
		}
	}

	/*
	 * Lets take an example - we have to display numbers if it is divisible by 2
	 * otherwise display some other message
	 */
	public void ifElseExamplesNum(int n1) {
		if (n1 % 2 == 0) {
			System.out.println(n1 + " is divisble by 2");
		} else {
			System.out.println(n1 + " is not divisble by 2");
		}
	}

	public static void main(String[] args) {

		IfElseExamples io = new IfElseExamples();
		io.ifElseExamples(23, 44);
		io.ifExamples(23, 44);
		io.ifExamplesNum(25); // will not print anything
		io.ifExamplesNum(26); 
		io.ifElseExamplesNum(456);
		
		io.ternaryOperator(23, 67);
		
	}

}
