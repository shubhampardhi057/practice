package com.prowings.practise;

public class DoWhileLoopContinue
{

	public static void main(String[] args)
	{
	
		int i=1;
		do
		{
			if(i == 4)
			{
				continue;
			}
		
		System.out.println("i's value is:"+i);
		i++;
		}
		while(i<6);
		}
}
