package com.prowings.practise;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		char operator;
		double number1,number2,result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an Operator: +,-,*,or/");
		
		operator= input.next().charAt(0);
		
		
		System.out.println("Enter First number");
		number1 =input.nextDouble();
		
		System.out.println("Enter Second number");
		number2 = input.nextDouble();
		
		switch(operator) {
		
		case'+' :
			result =(number1+number2);
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
			
		case'-' :
			result = (number1 - number2);
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
			
		case'*' :
			result = (number1 * number2);
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		
		case'/' :
			result =( number1 / number2);
			System.out.println(number1 +" / " + number2 + " = " + result);
			break;
			
		default:
			System.out.println("invalid operator!");
			break;
			
		}
		input.close();
		
	}
}


			
			
	