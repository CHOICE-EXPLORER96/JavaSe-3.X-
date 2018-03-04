package com.javabasics.rajeshwar;

/**
 * @author rsharma
 * @created_date Jan 7, 2018
 */

public class Constructor {

	private int studentId; // we can access within the class itself only
	private String studentName; // we can access within the class itself only
	static int roll;
	String address;

	/*
	 * so to set the values or we can say to initialize these variables while
	 * creating object in other class it is not possible to do directly since we
	 * cannot access this class outside this class So to set the values we are
	 * creating setter() method and then call this method in other class for
	 * initializing data members
	 */

	public int getStudentId() {

		return this.studentId;
	}

	public String getStudentName() {

		return this.studentName;
	}
	 // This is the instance initializer . this will excute before each and every constructor
	{
		address = "INDIA";
		System.out.println("Running Instance Initializer");

	}
 // This is the static initializer . this will excute once before all instance intializer and constructor
	static {
		roll = 123;
		System.out.println("Running Static Initializer");
	}

	public Constructor() {
		studentId = 234;
		studentName = "GaurNitai";

	}

	public Constructor(int studentId) { 
		this.studentId = studentId;
		System.out.println("Initialize student id");
	}

	public Constructor(String studentName) {
		this.studentName = studentName;
		System.out.println("Initialize student name");
	}

	public Constructor(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
		System.out.println("Initialize student name and id");
	}

	public void setStudentId(int studentId) { // This is setter method

		this.studentId = studentId;
	}

	public void setStudentName(String studentName) { // This is setter method

		this.studentName = studentName;
	}

	{
		address = "NEW DELHI";
		System.out.println("Running Instance Initializer II");

	}

	static {
		roll = 234;
		System.out.println("Running Static Initializer II");
	}

	// Also another important thing, in other class we cant even access these
	// private variables so even if I have to use we cant use simply by creating
	// object
	// so to use these data member I need to create getter() method with return
	// type which will return values in other class on calling and hence I can
	// access.

	/*
	 * public int getStudentId() {
	 * 
	 * return this.studentId; }
	 * 
	 * public String getStudentName() {
	 * 
	 * return this.studentName; }
	 */

	public static void main(String[] args) {

		Constructor con = new Constructor();
		// to set/initialize studentId need to call setStudentId
		con.studentId = 123;
		con.studentName = "Krishna";

		System.out.println(con.studentId);
		System.out.println(con.address);
		System.out.println(roll);
		System.out.println(con.studentName);
		System.out.println(roll);
		System.out.println(con.address);

		// otherwise use setter method
		con.setStudentId(456);
		con.setStudentName("Rama");

		System.out.println(con.studentId);
		System.out.println(con.studentName);
		Constructor con1 = new Constructor(444);

		Constructor con2 = new Constructor("GaurNitai");

		Constructor con3 = new Constructor("Hari", 999);

	}

}
