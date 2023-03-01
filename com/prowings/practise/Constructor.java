package com.prowings.practise;

public class Constructor{
	
	int rollno;
	String name;
	String address;
	
	
	
	public Constructor(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}



	public static void main(String[] args) {
		
		Constructor s1=new Constructor(101, "shubham","pune");
		
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
	}
	
}

			


