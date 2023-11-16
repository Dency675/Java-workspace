package com.ilp2023.basicprogramming;

import java.util.Scanner; //we are importing a package not a module

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char choice;
		String choice;
		Scanner scanner = new Scanner(System.in);
//		do{
//			System.out.println("Dency");
//			System.out.println("Do you want to print again (y/n): ");
//			choice = scanner.next().charAt(0); // to scan the character 
//		}while(choice == 'y'); //it checks the 1st character only.
		// do..while is exit control. It checks the condition to exit or not.

		do {
			System.out.println("Dency");
			System.out.println("Do you want to print again (y/n): ");
			choice = scanner.nextLine(); // to scan the string
		} while (choice.compareToIgnoreCase("yes") == 0);
		// here choice is reference variable which points to the String object "yes"
	}

}
