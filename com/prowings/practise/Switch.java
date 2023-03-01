package com.prowings.practise;

public class Switch {
	public static void main(String[] args) {
		int number = 28;
		String size;

		switch (number) {
		case 28:
			size = "small";
			System.out.println("Size: " + size);
			break;

		case 42:
			size = "Medium";
			System.out.println("Size: " + size);
			break;

		default:
			size = "unknown";
			System.out.println("Size: " + size);
			break;
		}
	}

}
