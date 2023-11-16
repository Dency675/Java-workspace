package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q17NumbersAddUpToSum8_v03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int arraySize = scanner.nextInt();
		int numberArray[] = new int[arraySize];

		System.out.print("Enter the elements of the array: ");
		for (int index = 0; index < numberArray.length; index++) {
			numberArray[index] = scanner.nextInt();
		}

		int targetSum = 8;
		Integer temporaryNumberArray[] = new Integer[arraySize];
		backtracking(numberArray, 0, 0, temporaryNumberArray, targetSum);
	}

	static void backtracking(int[] numberArray, int currentIndex, int currentSum, Integer[] temporaryNumberArray,
			int targetSum) {
		if (currentSum == targetSum) {
			for (int i = 0; i < temporaryNumberArray.length; i++) {
				if (temporaryNumberArray[i] != null) {
					System.out.print(temporaryNumberArray[i]);
					if ((i < temporaryNumberArray.length - 1)) {
						System.out.print(" + ");
					}
				}
			}
			System.out.println(" = " + targetSum);
			return;
		}

		if (currentIndex == numberArray.length || currentSum > targetSum) {
			return;
		}

		temporaryNumberArray[currentIndex] = numberArray[currentIndex];
		backtracking(numberArray, currentIndex + 1, currentSum + numberArray[currentIndex], temporaryNumberArray,
				targetSum);

		temporaryNumberArray[currentIndex] = null;
		backtracking(numberArray, currentIndex + 1, currentSum, temporaryNumberArray, targetSum);
	}
}
