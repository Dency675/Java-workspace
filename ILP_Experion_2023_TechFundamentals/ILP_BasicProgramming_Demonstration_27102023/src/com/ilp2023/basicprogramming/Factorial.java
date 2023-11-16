package com.ilp2023.basicprogramming;

import java.util.Scanner; //we are importing a package not a module

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr the value: ");
		int value = scanner.nextInt();
		int result = 1;
		for (int i = 2; i <= value; i++) {
			result *= i;
		}
		System.out.println("The factorial of " + value + " is " + result);
	}

}
