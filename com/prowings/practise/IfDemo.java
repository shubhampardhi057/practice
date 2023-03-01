package com.prowings.practise;

public class IfDemo
{

	public static void main(String[] args)
	{
		System.out.println(isGreaterSmaller(10,20));
	}
	public static String isGreaterSmaller(int n,int m)
	{
		if(n>m)
		{
			return ("n is greater");
		}
		else
		{
			return ("m is greater");
		}
	}
	
}
