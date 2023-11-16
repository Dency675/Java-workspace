package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q02AscendingAndDescendingFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q02AscendingAndDescendingFourNumbers q2AscendingAndDescendingFourNumbers = new Q02AscendingAndDescendingFourNumbers();

		Scanner scanner = new Scanner(System.in);
		int fourNumbers[] = new int[4];

		System.out.println("Enter four numbers: ");
		for (int index = 0; index < fourNumbers.length; index++)
			fourNumbers[index] = scanner.nextInt();

		q2AscendingAndDescendingFourNumbers.DescendingSortingArray(fourNumbers);

		System.out.println("Descending order of four numbers: ");
		for (int index = 0; index < fourNumbers.length; index++)
			System.out.print(fourNumbers[index] + " ");

		q2AscendingAndDescendingFourNumbers.AscendingSortingArray(fourNumbers);

		System.out.println();
		System.out.println("Ascending order of four numbers: ");
		for (int index = 0; index < fourNumbers.length; index++)
			System.out.print(fourNumbers[index] + " ");
	}

	void DescendingSortingArray(int fourNumbers[]) {
		int value;
		for (int index = 0; index < fourNumbers.length; index++) {
			value = fourNumbers[index];
			for (int index2 = index + 1; index2 < fourNumbers.length; index2++) {
				if (value < fourNumbers[index2]) {
					fourNumbers[index] = fourNumbers[index2];
					fourNumbers[index2] = value;
					value = fourNumbers[index];
				}
			}
		}
	}

	void AscendingSortingArray(int fourNumbers[]) {
		int value;
		for (int index = 0; index < fourNumbers.length; index++) {
			value = fourNumbers[index];
			for (int index2 = index + 1; index2 < fourNumbers.length; index2++) {
				if (value > fourNumbers[index2]) {
					fourNumbers[index] = fourNumbers[index2];
					fourNumbers[index2] = value;
					value = fourNumbers[index];
				}
			}
		}
	}
}
