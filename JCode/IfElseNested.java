/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

/*
 * Nested If else can be used when we have to validate single variable with multiple values 
 * Nested If will always traverse through all the if condition
 * unless it finds true statement and finally terminate the program
 */

public class IfElseNested {

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

	// Lets write the above code using IF-ELSE-IF

	public void nestedIfElseIfDept(int dept) {

		if (dept == 1) {
			System.out.println("Head of department is Mr. JDK");
		} else if (dept == 2) {
			System.out.println("Head of department is Mr. JVM");
		} else if (dept == 3) {
			System.out.println("Head of department is Mr. JRE");
		} else {
			System.out.println("Head of department is Mr. JIT");
		}
	}

	// lets design a program that will help citizen of india to find whether they
	// are eligible for voting or not and senior citizen range is above 60

	public void nestedIfElseVote1(int age) {

		if (age >= 18) { // here this condition has something missing and hence 2nd last condition will
							// never run
			System.out.println("You can please proceed to voting booth");
		} else {
			if (age < 18) {
				int gap = 18 - age;
				System.out.printf("You will be eligible to vote after %d years", gap);
				System.out.println("\n"); // if we dont place this .. next statement will print in continuation to this
			} else {
				if (age > 18 && age > 60) { // this condition will never execute due to first condition
					int gap = 60 - age;
					System.out.printf("Sir, you are %d years older than defined age and considered as senior citizen",
							gap);
				} else {
					System.out.println("Please enter valid age");
				}
			}
		}

	}

	// Solve above issue
	public void nestedIfElseVote2(int age) {

		if (age >= 18 && age < 60) {
			// never run
			System.out.println("You can please proceed to voting booth");
		} else {
			if (age < 18) {
				int gap = 18 - age;
				System.out.printf("You will be eligible to vote after %d years", gap);
				System.out.println("\n"); // if we dont place this .. next statement will print in continuation to this
			} else {
				if (age > 18 && age > 60) {
					int gap = age - 60;
					System.out.printf("Sir, you are %d years older than defined age and considered as senior citizen",
							gap);
				} else {
					System.out.println("Please enter valid age");
				}
			}
		}

	}

	// Lets simplify above code usinf IF-ELSE-IF
	public void nestedIfElseIfVote2(int age) {

		if (age >= 18 && age < 60) {
			// never run
			System.out.println("You can please proceed to voting booth");
		} else if (age < 18) {
			int gap = 18 - age;
			System.out.printf("You will be eligible to vote after %d years", gap);
			System.out.println("\n"); // if we dont place this .. next statement will print in continuation to this
		} else if (age > 18 && age > 60) {
			int gap = age - 60;
			System.out.printf("Sir, you are %d years older than defined age and considered as senior citizen", gap);
			System.out.println("\n");
		} else {
			System.out.println("Please enter valid age");
		}
	}

	
	public static void main(String[] args) {

		IfElseNested ion = new IfElseNested();
		ion.nestedIfElseDept(2); // JVM
		ion.nestedIfElseDept(4); // JIT
		System.out.println("*************************");
		ion.nestedIfElseIfDept(2); // JVM
		ion.nestedIfElseIfDept(4); // JIT
		System.out.println("*************************");
		ion.nestedIfElseVote1(26);
		ion.nestedIfElseVote1(16);
		ion.nestedIfElseVote1(76);
		System.out.println("*************************");
		ion.nestedIfElseVote2(26);
		ion.nestedIfElseVote2(16);
		ion.nestedIfElseVote2(76);
		System.out.println("\n*************************");
		ion.nestedIfElseIfVote2(26);
		ion.nestedIfElseIfVote2(16);
		ion.nestedIfElseIfVote2(76);

	}

}
