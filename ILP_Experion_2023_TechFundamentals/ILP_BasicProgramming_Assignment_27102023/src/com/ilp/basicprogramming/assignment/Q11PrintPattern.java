package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q11PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int lines = scanner.nextInt();

		for (int index = 1; index <= lines; index++) {
			for (int index2 = lines; index2 >= index; index2--) {
				System.out.print(index2 + " ");
			}
			System.out.println();
		}

	}

}
