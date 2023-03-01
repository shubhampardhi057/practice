package com.prowings.practise;

public class GetClass {
	public static void main(String[] args) {

		Object obj = new String("Shubham");
		Class<? extends Object> c = obj.getClass();

		System.out.println("Class of Object obj is  :=  " + c.getName());

		
		
	}

}
