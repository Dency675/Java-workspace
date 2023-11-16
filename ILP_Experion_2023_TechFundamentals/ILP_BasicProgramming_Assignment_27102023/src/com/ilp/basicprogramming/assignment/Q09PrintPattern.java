package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q09PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int lines = scanner.nextInt();

		for (int i = 1; i <= lines; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
