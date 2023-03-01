package com.prowings.practise;

public class CloneMethod
{
	int x,y;
	public CloneMethod() 
	{
		x=10;
		y=20;			
	}
	public static void main(String[] args)
	{
	
		CloneMethod obj1 =new CloneMethod();
		System.out.println(obj1.x+"  "+obj1.y);
		CloneMethod obj2 = obj1;
		obj2.x=100;
		System.out.println(obj1.x+"  "+obj1.y);
		System.out.println(obj2.x+"  "+obj2.y);
		
		
	

	}
	

}
