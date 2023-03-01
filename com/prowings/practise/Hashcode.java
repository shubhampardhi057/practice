package com.prowings.practise;

public class Hashcode
{

	static int lastrollno = 100;
	int rollno;

	public Hashcode() {                // Constructor
		rollno = lastrollno;
		lastrollno++;
	}

	// override hashcode()
	public int hashcode() {
		return rollno;
	}

	// Driver code
	public static void main(String[] args) {

		Hashcode H = new Hashcode();

		System.out.println(H);
		System.out.println(H.toString());

	}

}
