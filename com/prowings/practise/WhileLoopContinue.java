package com.prowings.practise;

public class WhileLoopContinue
{
public static void main(String[] args)
{
	int i=1;
	while(i<6)
	{
		if(i == 4)
		{
			i++;
			continue;
		}
		System.out.println("i's value is:"+i);
		i++;
		
	}
}
}
