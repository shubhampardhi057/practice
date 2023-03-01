package com.prowings.practise;

public class Employee {
	
	
	    int id;
	    String name;
	    Employee() {
		}
	    
         public Employee(int id,String name)
	{
	     this.id=id;
	     this.name=name;
	}
	    public static void main(String[] args)
	{
		Employee emp1= new Employee(123,"Shubham");
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
	}
	}



