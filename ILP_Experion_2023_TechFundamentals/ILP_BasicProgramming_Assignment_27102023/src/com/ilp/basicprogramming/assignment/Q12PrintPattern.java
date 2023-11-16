package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q12PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int lines = scanner.nextInt();

		int number = 1;
		for (int index = 1; index <= lines; index++) {
			for (int index2 = lines; index2 > index; index2--)
				System.out.print(" ");
			for (int index2 = 0; index2 < index; index2++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}

}
