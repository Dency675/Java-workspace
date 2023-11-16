package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q08SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q08SumOfSeries q8SumOfSeries = new Q08SumOfSeries();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = scanner.nextInt();

		float sumOfSeries = 0;
		for (int index = 1; index <= limit; index++) {
			sumOfSeries += (index
					/ ((q8SumOfSeries.powerOfNumbers(index)) + (q8SumOfSeries.factorialOfNumbers(index))));
		}
		System.out.println(sumOfSeries);

	}

	float factorialOfNumbers(int value) {
		float factorialOfNumber = 1;
		for (int i = 2; i <= value; i++) {
			factorialOfNumber *= i;
		}
		return factorialOfNumber;
	}

	float powerOfNumbers(int value) {
		float powerOfNumber = 1;
		for (int index = 1; index <= value; index++)
			powerOfNumber *= (value * value);
		return powerOfNumber;
	}

}
