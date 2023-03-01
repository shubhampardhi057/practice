package com.prowings.practise;

public class PositiveNegative 
{

	public static void main(String[] args) 
	{
		
	    int a[] = {1,2,3,-9,-8,6,5,-12,-11,-7};
		
	    System.out.println("Positive : =");
	    
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < 0)
			{
				System.out.println(a[i]);
				
			}
		}
		System.out.println("Negative : =");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > 0)
			{
			System.out.println(a[i]);
			}
		}
		
	}
}

