package com.javabasics.rajeshwar;

public class StringBasics {

	static String h = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare";
	static String r = "Hare Rama Hare Rama Rama Rama Hare Hare";
	static String m = "gud ni8, see you 4m monday";
	static String n = " =====gud ni8, see you 4m monday *******";
	static long beginTime, elapsedTime;

	public static void stringObjectLiteral() {

		// define using String Literal
		String s1 = "Hare Krishna";
		String s2 = "Hare Krishna";
		if (s1 == s2) {
			System.out.println("s1 and s2 are equal"); 
		} else {
			System.out.println("s1 and s2 are NOT equal");
		}

		// define string using new() keyword
		String s3 = new String("Hare Krishna");
		String s4 = new String("Hare Krishna");
		if (s3 == s4) {
			System.out.println("s1 and s2 are equal");
		} else {
			System.out.println("s1 and s2 are NOT equal");
		}

	}

	public static void stringIndex() {
		System.out.println(h.indexOf('K')); // 5
		System.out.println(h.indexOf("Krishna")); // 5

		System.out.println(h.indexOf('K', 6)); // 1
		System.out.println(h.indexOf("Krishna", 6)); // 1 .. ..its start counting from not till

		System.out.println(h.lastIndexOf('K', 25)); // 30 ...return 18 since starts counting in backward direction
		System.out.println(h.lastIndexOf("Krishna", 12)); // ....in simple term to remember ..its always foin to count
															// till not count from

		System.out.println(h.lastIndexOf('K')); // 34
		System.out.println(h.lastIndexOf("Krishna")); // 34 ..

	}

	public static void stringMisc() {
		System.out.println(r.toLowerCase());

		// hare rama hare rama rama rama hare hare
		System.out.println(h.toUpperCase());
		// HARE KRISHNA HARE KRISHNA KRISHNA KRISHNA HARE HARE
		System.out.println(h.replace("Krishna", "Rama"));
		System.out.println(h.replace('i', 'u'));
		// Hare Krushna Hare Krushna Krushna Krushna Hare Hare
		System.out.println(" hello ".trim());
		System.out.println(h.concat(" ").concat(r));
		// Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama
		// Rama Hare Hare

		System.out.println(h.concat(" ").concat("\n").concat(r));
		/*
		 * Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama
		 * Rama Hare Hare
		 */

		System.out.println(h.replaceAll("[A-Z]", "??")); // replace() and replaceAll works same but only difference is
															// regex
		// In replaceAll() we have regex, String whereas in replace we dont
		// ??are ??rishna ??are ??rishna ??rishna ??rishna ??are ??are
		System.out.println(h.replaceAll("[a-z]", "??"));

		// H?????? K???????????? H?????? K???????????? K???????????? K????????????
		// H?????? H??????
		System.out.println(m.replaceAll("[0-9]", "?"));
		// gud ni?, see you ?m monday
		System.out.println(h.replaceAll("^Hare", "Hari")); // to replace start ^
		// Hari Krishna Hare Krishna Krishna Krishna Hare Hare

		System.out.println(h.replaceAll("Hare$", "Hari")); // to replace end $
		// Hare Krishna Hare Krishna Krishna Krishna Hare Hari
		System.out.println(h.replaceAll("(Hare)+", "Hari"));
		System.out.println(n.replaceAll("=", "?")); // this is going to replace all ==== with ???? and to replace ====
													// with ? we should know exact no. of = in =====
		// ?????gud ni8, see you 4m monday *******
		System.out.println(n.replaceAll("(=)+", "?")); // but this will help to replace all ==== with single ?
		// ?gud ni8, see you 4m monday *******

		int i = 34567;
		System.out.println(String.valueOf(i));
		double d = 14526.77864;

		String sd = String.valueOf(d); // convert primitive double to string object
		// double ds = sd; // will throw error since sd holding String value now
		System.out.println(sd);

	}

	public static void stringStringBufferBuilderCompare() {
		// StringBuffer is faster than String
		// StringBuilder is 2x faster than StringBuffer, and 300x faster than String

		beginTime = System.nanoTime();
		StringBuffer sBufferReverseMethod = new StringBuffer(h);
		sBufferReverseMethod.reverse(); // use reverse() method
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " + elapsedTime / 1000 + " (Using StringBuffer's reverse() method)");

		// Reverse a String by creating a StringBuilder with the given String and invoke
		// its reverse()
		beginTime = System.nanoTime();
		StringBuffer sBuilderReverseMethod = new StringBuffer(h);
		sBuilderReverseMethod.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " + elapsedTime / 1000 + " (Using StringBuidler's reverse() method)");
	}

	public static void main(String[] args) {
		stringObjectLiteral();
		stringIndex();
		stringMisc();
		stringStringBufferBuilderCompare();

	}

}
