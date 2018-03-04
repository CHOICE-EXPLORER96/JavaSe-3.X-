/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

// Switch statement can be used when we dont have boolean expression as a part of condition
// Switch statement can be used when we have single variable to compare with mutiple known values
// Switch statement cannot replace Nested IF ELSE in case there is ranges to compare or we have boolean expression to evaluate

/*The switch statement uses four keywords:
 1. SWITCH starts the structure and is followed immediately by a test expression enclosed in parentheses.
 2. CASE is followed by one of the possible values for the test expression and a colon.
 3. BREAK optionally terminates a switch statement at the end of each case.
 4. DEFAULT optionally is used prior to any action that should occur if the test variable does not match any case.
*/
public class SwitchCaseExample {

	/*
	 * lets consider we have 4 departments in organisation and every department has
	 * some head people and we have to find head based on department
	 */

	public void nestedIfElseDept(int dept) {

		if (dept == 1) {
			System.out.println("Head of department is Mr. JDK");
		} else {
			if (dept == 2) {
				System.out.println("Head of department is Mr. JVM");
			} else {
				if (dept == 3) {
					System.out.println("Head of department is Mr. JRE");
				} else {
					System.out.println("Head of department is Mr. JIT");
				}
			}
		}

	}

	// Lets write the above nested if else using SWITCH CASE
	// IT helps to simply the ambiguity of NESTED IF ELSE. we can observe how clean
	// and understandable
	// the below code is as compared to above one

	public void switchCaseDept(int dept) {

		switch (dept) {

		case 1:
			System.out.println("Head of department is Mr. JDK");
		case 2:
			System.out.println("Head of department is Mr. JVM");
		case 3:
			System.out.println("Head of department is Mr. JRE");
		default:
			System.out.println("Head of department is Mr. JIT");

		}

	}

	// In above SWITCH CASE statement all the case statement after valid CASE
	// statement will execute even though it will be invalid. So to avoid that
	// scenario we need to add 'break' keyword in every CASE block
	public void switchCaseDeptBreak(int dept) {

		// int d = dept ; // we cannot store dept variable value in another variable and
		// pass to Case
		switch (dept) {

		// case d: // we cannot mention variables in CASE statement since Case statement
		// never accept at run time
		// System.out.println("Head of department is Mr. JDK");
		// break;
		case 1:
			System.out.println("Head of department is Mr. JDK");
			break;
		case 2:
			System.out.println("Head of department is Mr. JVM");
			break;
		case 3:
			System.out.println("Head of department is Mr. JRE");
			break;
		default:
			System.out.println("Head of department is Mr. JIT");
			break;

		}

	}

	public void switchCaseDuplicateDept1(int dept) {

		switch (dept) {

		case 1:
			System.out.println("Head of department is Mr. JDK");
			break;
		case 2:
			System.out.println("Head of department is Mr. JVM");
			break;
		case 3:
			System.out.println("Head of department is Mr. JRE");
			break;
		case 4:
			System.out.println("Head of department is Mr. JDK");
			break;
		case 6:
			System.out.println("Head of department is Mr. JVM");
			break;
		default:
			System.out.println("Head of department is Mr. JIT");
			break;

		}

	}

	// If we have same output for different CASE as in above code then its not necessary to write
	// CASE block for every CASE rather we can keep blank as follows
	public void switchCaseDuplicateDept2(int dept) {

		switch (dept) {

		case 4: // JDK
		case 6:
		case 1:
			System.out.println("Head of department is Mr. JDK");
			break;
		case 2:
			System.out.println("Head of department is Mr. JVM");
			break;
		case 3:
			System.out.println("Head of department is Mr. JRE");
			break;
		// case 4: // JIT
		// case 6:
		default:
			System.out.println("Head of department is Mr. JIT");
			break;

		}

	}

	public static void main(String[] args) {

		SwitchCaseExample s = new SwitchCaseExample();
		s.nestedIfElseDept(3);
		s.switchCaseDept(3);
		s.switchCaseDuplicateDept1(4);
		System.out.println("\n");
		s.switchCaseDuplicateDept2(4);

	}

}
