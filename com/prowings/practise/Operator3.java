package com.prowings.practise;

public class Operator3
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		// Logical AND (&&)
		System.out.println((a  < b) && (b  >  a));
		System.out.println((a  < b) && (b  <= a));
		System.out.println((a >= b) && (b  >  a));
		System.out.println((a  > b) && (b  <= a));
		
		
		// Logical OR  (||)
		System.out.println((a <  b) || (b  > a));
		System.out.println((a != b) || (b <  a));
		System.out.println((a >= b) || (b >  a));
		System.out.println((a >  b) || (b == a));
		
		
		// Logical NOT  (!)		
		System.out.println(  !(a  <   b)  );
		System.out.println(  !(a  >=  b)  );
			
	}
	
	
}
