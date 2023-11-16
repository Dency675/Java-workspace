package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class LoopWhileDemo_v01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value n: ");
		int limit = scanner.nextInt();
		int counter = 1;
		while (counter <= limit) {
			System.out.println(counter);
			counter++;
		}

	}

}