package com.ilp.basicprogramming.assignment;

import java.util.Scanner;

public class Q16CountOccurrenceOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q16CountOccurrenceOfAllNumbers q16CountOccurrenceOfAllNumbers = new Q16CountOccurrenceOfAllNumbers();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int arraySize = scanner.nextInt();

		int numberArray[] = new int[arraySize];

		System.out.print("Enter the numbers in the array : ");
		for (int index = 0; index < numberArray.length; index++)
			numberArray[index] = scanner.nextInt();

		q16CountOccurrenceOfAllNumbers.AscendingSortingArray(numberArray);

		int count =0;
		for (int index = 0; index < numberArray.length; index+=count) {
				count = 0;
			for (int index2 = 0; index2 < numberArray.length; index2++) {
				if (numberArray[index]==numberArray[index2] ) {
					count++;
				}
			}
			
			System.out.println("The occurance of "+numberArray[index] + " is " +count);
		}
	}

	void AscendingSortingArray(int numberArray[]) {
		int value;
		for (int index = 0; index < numberArray.length; index++) {
			value = numberArray[index];
			for (int index2 = index + 1; index2 < numberArray.length; index2++) {
				if (numberArray[index] > numberArray[index2]) {
					numberArray[index] = numberArray[index2];
					numberArray[index2] = value;
					value = numberArray[index];
				}
			}
		}
	}

}
