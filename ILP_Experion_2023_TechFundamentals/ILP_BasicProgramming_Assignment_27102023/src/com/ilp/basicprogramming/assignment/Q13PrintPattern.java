package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q13PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int lines = scanner.nextInt();

		for (int index = 1; index <= lines; index += 2) {
			for (int index2 = lines; index2 > index; index2--)
				System.out.print(" ");
			for (int index2 = 0; index2 < index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int index = lines - 2; index > 0; index -= 2) {
			for (int index2 = lines; index2 > index; index2--)
				System.out.print(" ");
			for (int index2 = index; index2 > 0; index2--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
