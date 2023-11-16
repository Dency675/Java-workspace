package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q04SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the limit: ");
		int limit = scanner.nextInt();

		Q04SumOfSeries q4SumOfSeries = new Q04SumOfSeries();
		q4SumOfSeries.fibanocci(limit);
	}

	void fibanocci(int limit) {
		int firstNumber = 1;
		int secondNumber = 1;
		int thirdNumber;
		int result = 0;

		for (int index = 0; index < limit; index++) {
			int product = 1;
			for (int i = 0; i < 3; i++)
				product *= firstNumber;
			result += product;
			thirdNumber = secondNumber + firstNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}

		System.out.println(result);

	}
}