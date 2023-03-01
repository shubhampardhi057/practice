package com.prowings.practise;

public class TernaryOperrator
{
		public static void main(String[] args)
		{
			
		 String result=isvalidvoter(15,"india")?("valid"):("not valid");
		 
		 //boolean b = Boolean.valueOf(result);
		 
	      System.out.println(result);
			
		}
		public static boolean isvalidvoter(int age,String country)
		{
			
			if(age >= 18 && country.equalsIgnoreCase("india"))
			{
				
			     return true;
			}
			  
				  return false;
			 
		}
	}


