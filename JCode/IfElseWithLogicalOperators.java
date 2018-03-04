/**
 * @author gaurnitai
 * @created_date Jan 15, 2018
 */

package com.javabasics.decisonmakingstatements;

public class IfElseWithLogicalOperators {

	int largest;

	public void ifElseMultiway2(int n1, int n2, int n3) {

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

	public void ifElseLogicalOperator(int n1, int n2, int n3) {

		if (n1 > n2 && n1 > n3) { // always remember && operators validate right side only if left side is true
			largest = n1;
			System.out.println("n1 is greatest " + largest);
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
	
	public void ifElseLogicalOperator1(int n1, int n2, int n3) {

		if (n1 > n2 & n1 > n3) { // always remember && operators validate right side only if left side is true
			largest = n1;
			System.out.println("n1 is greatest " + largest);
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
	
	
	// lets design a code that will help to find all the employees of Dept 1 and dept 2
    // here if we see the above requirement it is mentioned 'and' and here most of the newbies in programming get trapped 
	// and use && operator but if we logically think it is rarely possible one guy can have two instance in two different possible
	// One guys can only be belongs to one department
	// So here the actual requirement is to get all the employees whether it is from dept 1 or dept 2 
	
	
	public void logicalOperatorDeptAnd(int dept1, int dept2) {
		if(dept1 == 2 && dept2 < 3 ) {
			System.out.println("Employee belongs to QA ");
		} else {
			System.out.println("Employee belongs to BA ");
		}
		
	}
	
	public void logicalOperatorDeptOr(int dept1, int dept2) {
		if(dept1 == 2 || dept2 < 3 ) {
			System.out.println("Employee belongs to QA ");
		} else {
			System.out.println("Employee belongs to BA ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		IfElseWithLogicalOperators io = new IfElseWithLogicalOperators();
		io.ifElseMultiway2(12, 23, 34);
		io.ifElseMultiway2(13, 23, 14);
		io.ifElseMultiway2(43, 23, 14);
		
		System.out.println("\n");
		io.ifElseLogicalOperator(12, 23, 34);
		io.ifElseLogicalOperator(13, 23, 14);
		io.ifElseLogicalOperator(43, 23, 14);
		
		System.out.println("\n");
		io.ifElseLogicalOperator1(12, 23, 34);
		io.ifElseLogicalOperator1(13, 23, 14);
		io.ifElseLogicalOperator1(43, 23, 14);
		
		io.logicalOperatorDeptAnd(4,3); // this will return BA - // always remember && operators validate right side only if left side is true
		io.logicalOperatorDeptAnd(4,1); // 
		io.logicalOperatorDeptAnd(2,3);
		io.logicalOperatorDeptAnd(2,1); // this will give QA
	
		io.logicalOperatorDeptOr(4,3); // this will return BA - // always remember && operators validate right side only if left side is true
		io.logicalOperatorDeptOr(4,1); // 
		io.logicalOperatorDeptOr(2,3);
		io.logicalOperatorDeptOr(2,1); // this will give QA
		
	}

}
