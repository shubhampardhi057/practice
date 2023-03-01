package com.prowings.practise;

public class ForLoopBreakAndContinue1 
{
public static void main(String[] args) 
{
	for(int i=1;i<=10;i++)
	{
		if(i == 7)
			break;
		else if(i == 5)
			continue;
		System.out.println("i="+i);
	}
}
}
