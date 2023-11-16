package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q03SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = scanner.nextInt();
		int sign = -1;
		int result = 0;

		for (int index = 1; index <= limit; index++) {
			if ((index % 2) == 1) {
				sign *= (-1);
				result += (sign * index);
			}
		}
		System.out.println(result);
	}

}
