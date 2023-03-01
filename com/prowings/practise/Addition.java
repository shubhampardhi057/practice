package com.prowings.practise;

public class Addition {

	public static void main(String[] args) {
		
		int x=addition(20,30);
		square(x);
	}
	public static void square(int x) 
	{
	int result=0;
	result = x*x;
	System.out.println(result);
	}

	public static int addition(int i, int j)
	{
		int result=0;
		result = i+j;
		System.out.println(result);
	return result;
	}
}
