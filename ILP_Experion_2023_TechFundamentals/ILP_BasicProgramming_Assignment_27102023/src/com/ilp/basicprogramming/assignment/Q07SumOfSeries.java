package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q07SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q06SumOfSeries q6SumOfSeries = new Q06SumOfSeries();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int value = scanner.nextInt();

		q6SumOfSeries.factorial(value);
		float sumOfSeries = 0;
		for (int index = 1; index <= value; index++) {
			sumOfSeries += (index / (q6SumOfSeries.factorial(index * index)));
		}
		System.out.println(sumOfSeries);

	}

	float factorial(int value) {
		float result = 1;
		for (int i = 2; i <= value; i++) {
			result *= i;
		}
		return result;
	}

}
