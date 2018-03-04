/**
 * @author rsharma
 * @created_date Jan 7, 2018
 */

package com.javabasics.rajeshwar;

public class WrapperClass {

	public static void boxing() {
		// converting primitive data type into object
		Integer io = new Integer(123); // Boxing
		Integer io1 = 123;
		Integer io2 = new Integer("123");
		System.out.println(io2 + io2); // expected 123 covert to Integer object and sum will be 246
		Integer io3 = Integer.valueOf(123); // This is another way of boxing primitive to object

	}

	public static void autoBoxing() {
		// converting primitive data type into object
		Integer io = new Integer(123); // Boxing
		int ip = io.intValue(); // Unboxing - to covert object to corresponding primitive data type
		System.out.println(ip);
		Integer io1 = 123;
		int ip1 = io1;
		System.out.println(ip);
		Integer io2 = new Integer("123");
		int ip2 = io2;
		System.out.println(ip2 + io2); // expected ip2 + io2 = 246
		Integer io3 = Integer.valueOf(222); // This is another way of boxing primitive to object
		int ip3 = io3; // (Auto-Unboxing)
		System.out.println(ip3 + io3); // expected ip2 + io2 = 444
	}

	public static void toStringObject() {
		// to convert primitive Object datatype to String object
		int i = 1234;
		// i.toString(); // cannot possible since i is primitive
		Integer io = new Integer(123);
		System.out.println(io + io); // expected 123 + 123 = 246
		String so = io.toString();
		System.out.println(so + so); // To verify its string or not - expected 123123 not 246

	}

	public static void stringToPrimitive() {
		// to covert String object into primitive data type - parseInt()
		int i = Integer.parseInt("123");
		System.out.println(i);

		// Also we can use valueOf() to convert string to Integer primitive Object
		int i1 = Integer.valueOf("123");
		System.out.println(i1);
		// If we want to convert the string to integer without using parseInt(),
		// we can use valueOf() method. It also has two variants similar to parseInt().

		// Difference between parseInt() and valueOf():
		// parseInt() parses the string and returns the primitive integer type.
		// However, valueOf() returns an Integer object.
		// Note: valueOf() uses parseInt() internally to convert to integer.

	}

	public static void main(String[] args) {
		boxing();
		autoBoxing();
		toStringObject();
		stringToPrimitive();

	}

}
