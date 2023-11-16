package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q10PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int lines = scanner.nextInt();
		char alphabet = 'A';
		for (int i = 1; i <= lines; i++) {

			for (int k = 0; k < 2 * (lines - i); k++)
				System.out.print(" ");

			alphabet = 'A';
			for (int j = i; j > 0; j--) {
				System.out.print(alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}

	}

}
