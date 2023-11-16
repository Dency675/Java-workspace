package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int lines = scanner.nextInt();

		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
