package com.ilp2023.basicprogramming;

import java.util.Scanner;

public class LoopWhileDemo_v02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value n: ");
		int limit = scanner.nextInt();
		int counter = 1;
		while (counter <= limit) {
			if (counter == 5) {
				counter++;
				continue; // continue the loop
			}
			System.out.println(counter);
			counter++;
		}

	}

}